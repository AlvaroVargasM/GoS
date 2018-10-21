
package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.Main;
import static com.mygdx.game.Main.winHeight;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import sprites.RiderShoot;
import sprites.Dragon;
import sprites.Infantry;
import sprites.Captain;
import sprites.Commander;
import sprites.EnemyShoot;
import sprites.DragonRider;
import dataStructures.LinkedList;
import dataStructures.LinkedListNode;
import sprites.InfoPanel;
import sprites.scrollingBackground;


public class GameScreen implements Screen{
    
    private DragonRider rider = new DragonRider();
    public static float shootCoolDown= 0.15f;
    public float shootTimer;
    
    private LinkedList<RiderShoot> riderShoots;
    private LinkedList<EnemyShoot> enemyShoots;
    private LinkedList<Dragon> dragons;
    
    int[] overlapedSprites;
    
    private Point2D.Float[] dragonPositions = new Point2D.Float[20];
    
    float deltaTime;
    float stateTime;
    
    scrollingBackground background;
    InfoPanel infoPanel;
    
    Main main;

    public GameScreen(Main game) {
        this.main = game;
        
        background = new scrollingBackground();
        infoPanel = new InfoPanel();
        
        riderShoots = new LinkedList<RiderShoot>();
        enemyShoots = new LinkedList<EnemyShoot>();
        dragons = new LinkedList<Dragon>();
        overlapedSprites = new int[3];

        dragonPositions = setInitialPositions(dragonPositions);
    }
    
    @Override
    public void show() {}

    @Override
    public void render(float delta) {   
            Gdx.gl.glClearColor((float)253/255, (float)141/255, (float)127/255, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            main.batch.begin();
            deltaTime = Gdx.graphics.getDeltaTime();
            stateTime += deltaTime;
            shootTimer += deltaTime;

            manageInputs();
 
            renderSprites();
            
            manageCollisions();
            
            if(rider.life==0){
                this.dispose(); 
                main.setScreen(new GameOver(main,0));
            }
            
            main.batch.end();
    }

    @Override
    public void resize(int width, int height) {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}
    @Override
    public void dispose() {}
    
    private Point2D.Float[] setInitialPositions(Point2D.Float[] list){
        float x = 1690;
        float y = 740;
        
        for(int i=0;i<20;i++){
            list[i]= new Point2D.Float(x,y);
            y-=90;
            if(i==8 || i==15) x-=120;
            if(i==8) y=640;
            if(i==15) y=540;
        }
        
        return list;
    }
    
    private void manageInputs(){
        if(Gdx.input.isKeyJustPressed(Input.Keys.A)){
                for(int i=0;i<20;i++){
                    dragonPositions = setInitialPositions(dragonPositions);
                    Commander draco = new Commander("Clavija",i);
                    draco.setFather("Porcio");
                    draco.setDragonsInCommand(new String[]{"Ald","Bass","Carl"});
                    dragons.add(draco);
                }
            }
            if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && shootTimer > shootCoolDown){
                shootTimer=0;
                riderShoots.add(new RiderShoot(rider.getX(), rider.getY(), rider.getOrientation()));
            }
            rider.movement(deltaTime);
    }
    
    private void renderSprites(){
        
        for(int i =0; i <dragonPositions.length; i++) dragonPositions[i].x -= 100*deltaTime;
        
        
        background.renderBackLayer(deltaTime, main.batch);
        
        for(LinkedListNode node = riderShoots.getFirstNode(); node != null; node = node.getNextNode()){
            RiderShoot rShoot = (RiderShoot)node.getData();
            rShoot.update(deltaTime);
            rShoot.render(main.batch,stateTime);
        } 
            
        for(LinkedListNode node = enemyShoots.getFirstNode(); node != null; node = node.getNextNode()){
            EnemyShoot eShoot = (EnemyShoot)node.getData();
            eShoot.update(deltaTime);
            eShoot.render(main.batch,stateTime);
        }
            
        rider.render(main.batch,stateTime,deltaTime);
            
        for(LinkedListNode node = dragons.getFirstNode(); node != null; node = node.getNextNode()){
            Dragon dragon = (Dragon)node.getData();
            dragon.update(deltaTime, (80*deltaTime));
            dragon.render(dragonPositions[dragon.getPosition()].x,dragonPositions[dragon.getPosition()].y,main.batch,stateTime,deltaTime);
            if(dragon.getShooting()){
                enemyShoots.add(new EnemyShoot(dragon.getIsCommander(),dragon.getX()-20,dragon.getY()+15));
                dragon.restartShoot();
            }
            //////clicking a dragon
            if(Gdx.input.isTouched() && (dragon.getSprite().contains(Gdx.input.getX(), Gdx.input.getY()))){
                infoPanel.setDragonInfo(dragon);
            }
        }
            
        infoPanel.render(deltaTime, main.batch);
        background.renderFrontLayer(deltaTime, main.batch);
            
    }
    
    private void manageCollisions(){
        int[] overlapedSprites = new int[3];
            overlapedSprites[0]=-1;
            for(LinkedListNode node1 = enemyShoots.getFirstNode(); node1 != null; node1 = node1.getNextNode()){
                EnemyShoot eShoot = (EnemyShoot)node1.getData();
                if(rider.getSprite().overlaps(eShoot.getSprite())){
                    overlapedSprites[0]=1;
                    overlapedSprites[1]= node1.getPosition();
                }
                for(LinkedListNode node2 = riderShoots.getFirstNode(); node2 != null; node2 = node2.getNextNode()){
                    RiderShoot rShoot = (RiderShoot)node2.getData();
                    if(eShoot.getSprite().overlaps(rShoot.getSprite())){
                        overlapedSprites[0]=2;
                        overlapedSprites[1]= node1.getPosition();
                        overlapedSprites[2]= node2.getPosition();
                    } 
                }
            }
            for(LinkedListNode node1 = dragons.getFirstNode(); node1 != null; node1 = node1.getNextNode()){
                Dragon dragon = (Dragon)node1.getData();
                if(rider.getSprite().overlaps(dragon.getSprite())){
                    overlapedSprites[0]=3;
                    overlapedSprites[1]= node1.getPosition();
                }
                for(LinkedListNode node2 = riderShoots.getFirstNode(); node2 != null; node2 = node2.getNextNode()){
                    RiderShoot rShoot = (RiderShoot)node2.getData();
                    if(dragon.getSprite().overlaps(rShoot.getSprite())){
                        overlapedSprites[0]=4;
                        overlapedSprites[1]= node1.getPosition();
                        overlapedSprites[2]= node2.getPosition();
                    } 
                }
            }   
            switch(overlapedSprites[0]){
                //rider X enemy shoot
                case 1:
                    enemyShoots.deleteNodeInPosition(overlapedSprites[1]);
                    rider.hit();
                    break;
                //rider shoot X enemy shoot    
                case 2:
                    enemyShoots.deleteNodeInPosition(overlapedSprites[1]);
                    riderShoots.deleteNodeInPosition(overlapedSprites[2]);
                    break;
                //rider X dragon    
                case 3:
                    dragons.deleteNodeInPosition(overlapedSprites[1]);
                    rider.hit();
                    break;
                //rider shoot X dragon    
                case 4:
                    dragons.deleteNodeInPosition(overlapedSprites[1]);
                    riderShoots.deleteNodeInPosition(overlapedSprites[2]);
                    break;    
            }
    }
        
}

