
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


public class GameScreen implements Screen{
    
    private DragonRider rider = new DragonRider();
    public static float shootCoolDown= 0.3f;
    public float shootTimer;

    public Texture background;
    
    private LinkedList<RiderShoot> riderShoots;
    private LinkedList<EnemyShoot> enemyShoots;
    int[] overlapedSprites;
    
    private Dragon[] dragons = new Dragon[20];
    private Point2D.Float[] dragonPositions = new Point2D.Float[20];
    
    float deltaTime;
    float stateTime;
    
    Main main;

    public GameScreen(Main game) {
        this.main = game;
        
        background = new Texture("castle.png");
        
        riderShoots = new LinkedList<RiderShoot>();
        enemyShoots = new LinkedList<EnemyShoot>();
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
            
            main.batch.draw(background, 0,0,1920,1080);
            
            deltaTime = Gdx.graphics.getDeltaTime();
            stateTime += deltaTime;
            shootTimer += deltaTime;

            
            if(Gdx.input.isKeyJustPressed(Input.Keys.A)){
                for(int i=0;i<20;i++){
                    Captain draco = new Captain("Mr. Johns",(float)dragonPositions[i].getX(),(float)dragonPositions[i].getY());
                    dragons[i]= draco;
                }
            }
            
            if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && shootTimer > shootCoolDown){
                shootTimer=0;
                riderShoots.add(new RiderShoot(rider.getX()+30, rider.getY()+15));
            }
                        
            for(LinkedListNode node = riderShoots.getFirstNode(); node != null;
            node = node.getNextNode()){
                RiderShoot rShoot = (RiderShoot)node.getData();
                rShoot.update(deltaTime);
                rShoot.render(main.batch,stateTime);
            } 
            
            rider.movement(deltaTime);
            rider.render(main.batch,stateTime,deltaTime);
            
            int[] overlapedSprites = new int[3];
            
            overlapedSprites[0]=-1;
            for(LinkedListNode node = enemyShoots.getFirstNode(); node != null;
            node = node.getNextNode()){
                EnemyShoot eShoot = (EnemyShoot)node.getData();
                eShoot.update(deltaTime);
                eShoot.render(main.batch,stateTime);
                
                for(LinkedListNode node2 = riderShoots.getFirstNode(); node2 != null;
                node2 = node2.getNextNode()){
                RiderShoot rShoot = (RiderShoot)node2.getData();
                
                if(eShoot.getSprite().overlaps(rShoot.getSprite())){
                    overlapedSprites[0]=1;
                    overlapedSprites[1]= node.getPosition();
                    overlapedSprites[2]= node2.getPosition();
                    }
                }
                
                
            }
            
            if(overlapedSprites[0] == 1) enemyShoots.deleteNodeInPosition(overlapedSprites[1]);
            if(overlapedSprites[0] == 1) riderShoots.deleteNodeInPosition(overlapedSprites[2]);
            
            
            
            for(int i=0;i<dragons.length;i++){
                if(!(dragons[i]==null)){
                    dragons[i].update(deltaTime, (80*deltaTime));
                    dragons[i].render(main.batch,stateTime,deltaTime);
                    if(dragons[i].getShooting()){
                        enemyShoots.add(new EnemyShoot(dragons[i].getIsCommander(),dragons[i].getX()-20,dragons[i].getY()+15));
                        dragons[i].restartShoot();
                    }
                }
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
        float x = 1250;
        float y = 850;
        
        for(int i=0;i<20;i++){
            list[i]= new Point2D.Float(x,y);
            y-=110;
            if(i==8 || i==15) x-=110;
            if(i==8) y=750;
            if(i==15) y=650;
        }
        
        return list;
    }
}

