
package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import static com.game.main.GameOfSorts.winHeight;
import com.game.main.GameOfSorts;

import java.awt.geom.Point2D;
import sprites.RiderShoot;
import sprites.Dragon;
import sprites.Infantry;
import sprites.Captain;
import sprites.Commander;
import sprites.EnemyShoot;
import sprites.DragonRider;
import dataStructures.LinkedList;
import dataStructures.LinkedListNode;
import java.util.Random;
import sprites.InfoPanel;
import sprites.ScrollingBackground;

/**
 * Game screen. It has the game loop and all the mechanics
 * @author Luis Mariano Ramírez
 */
public class GameScreen implements Screen{
    
    private DragonRider rider = new DragonRider();
    private static float shootCoolDown= 0.15f;
    private float shootTimer;
    private LinkedList<RiderShoot> riderShoots;
    private LinkedList<EnemyShoot> enemyShoots;
    private LinkedList<Dragon> dragons;
    private int[] overlapedSprites;
    private Point2D.Float[] dragonPositions = new Point2D.Float[20];
    private float deltaTime;
    private float stateTime;
    private ScrollingBackground background;
    private InfoPanel infoPanel;
    private int sortCounter;
    private GameOfSorts main;

    /**
     * Game screen constructor.
     * @param game Single instance of the class GameOfSorts, used to manage visual rendering and screen disposal.
     */
    public GameScreen(GameOfSorts game) {
        this.main = game;
        
        background = new ScrollingBackground();
        infoPanel = new InfoPanel();
        
        riderShoots = new LinkedList<RiderShoot>();
        enemyShoots = new LinkedList<EnemyShoot>();
        dragons = new LinkedList<Dragon>();
        overlapedSprites = new int[3];

        dragonPositions = setInitialPositions(dragonPositions);
        
        sortCounter=0;
        
        //temporal, need to call the server for a horde
        createHorde();
        ///
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
            if(sortCounter > 2) sortCounter = 1;

            manageInputs();
 
            renderSprites();
           
            
            if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)){
                dragons.selectionSort();
                updateDragonPositions();
                dragonTransition();
            }
            
            if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)){
                dragons.insertionSort();
                updateDragonPositions();
                dragonTransition();
            }
            
            if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)){
                
                for(LinkedListNode node = dragons.getFirstNode(); node != null; node = node.getNextNode()){
                    Dragon dragon = (Dragon) node.getData();
                    int n = dragon.getPosition() +1;
                    if(n==20) n=0;
                    dragon.setPosition(n);
                }
                dragonTransition();
            }
            
            manageCollisions();
            
            if(rider.life==0){
                this.dispose(); 
                main.setScreen(new GameOver(main,0));
            }
            
            if(dragons.getSize()==0) createHorde();
            
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
        float x = 1590;
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
    
    //temporal
    private void createHorde(){
        dragonPositions = setInitialPositions(dragonPositions);
            for(int i=0;i<20;i+=3){
                Commander draco = new Commander("ClavijaJr",i);
                draco.setFather("Clavija");
                draco.setDragonsInCommand(new String[]{"Ald","Bass","Carl"});
                dragons.add(draco);
                
                Captain draco2 = new Captain("BryanJr",i+1);
                draco2.setFather("Navaja");
                draco2.setInfantryInCommand(new String[]{"John","Claire","Pom"});
                dragons.add(draco2);
                
                if(i+2 < 20){
                    Infantry draco3 = new Infantry("CharlesJr",i+2);
                    draco3.setFather("Charles");
                    draco3.setCaptain("Harlock");
                    dragons.add(draco3);
                }
            }
    }
    
    /**
     * Method to manage the responses for both keyboard and mouse inputs from the user.
     */
    private void manageInputs(){
        
        //Crate horde
        if(Gdx.input.isKeyJustPressed(Input.Keys.A)){
            dragonPositions = setInitialPositions(dragonPositions);
            for(int i=0;i<20;i+=3){
                Commander draco = new Commander("ClavijaJr",i);
                draco.setFather("Clavija");
                draco.setDragonsInCommand(new String[]{"Ald","Bass","Carl"});
                dragons.add(draco);
                
                Captain draco2 = new Captain("BryanJr",i+1);
                draco2.setFather("Navaja");
                draco2.setInfantryInCommand(new String[]{"John","Claire","Pom"});
                dragons.add(draco2);
                
                if(i+2 < 20){
                    Infantry draco3 = new Infantry("CharlesJr",i+2);
                    draco3.setFather("Charles");
                    draco3.setCaptain("Harlock");
                    dragons.add(draco3);
                }
            }
        }
        

        
        
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && shootTimer > shootCoolDown){
            shootTimer=0;
            riderShoots.add(new RiderShoot(rider.getX(), rider.getY(), rider.getOrientation()));
        }
        rider.movement(deltaTime);
    }
    
    /**
     * Method that takes care of updating and rendering every frame all the sprites on the screens.
     */
    private void renderSprites(){
        
        // dragon velocity
        for(int i =0; i <dragonPositions.length; i++) dragonPositions[i].x -= 40*deltaTime;
        
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
            dragon.render(dragonPositions[dragon.getPosition()].x,dragonPositions[dragon.getPosition()].y,main.batch,stateTime,deltaTime);
            if(dragon.getShooting()){
                enemyShoots.add(new EnemyShoot(dragon.getIsCommander(),dragon.getX()-20,dragon.getY()+15));
                dragon.restartShoot();
            }
            if(Gdx.input.isTouched() && (dragon.getSprite().contains(Gdx.input.getX(), (winHeight-Gdx.input.getY()) ))){
                infoPanel.setDragonInfo(dragon);
            } 
        }
        
        infoPanel.render(deltaTime, main.batch);
        background.renderFrontLayer(deltaTime, main.batch);
            
    }
    
    /**
     * Method that manages all the collision detection and it's responses.
     */
    private void manageCollisions(){
        int[] overlapedSprites = new int[4];
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
                    dragon.hit();
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
                /////////////////////
                case 4:
                    riderShoots.deleteNodeInPosition(overlapedSprites[2]);
                    dragons.deleteNodeInPosition(overlapedSprites[1]);
                    
                    sortCounter++;
                    switch(sortCounter){
                        case 1:
                            dragons.selectionSort();
                            break;
                        case 2:
                            dragons.insertionSort();
                            break;
                    }
                    
                    updateDragonPositions();
                    dragonTransition();
                    
                    break;    
            }
            
            
    }
    
    /**
     * It animates the displacement of every dragon when the order layout changes.
     */
    private void dragonTransition(){
        for(LinkedListNode node = dragons.getFirstNode(); node != null; node = node.getNextNode()){
            Dragon dragon = (Dragon)node.getData();
            float initialX = dragon.getX();
            float initialY = dragon.getY();
            float finalX = dragonPositions[dragon.getPosition()].x;
            float finalY = dragonPositions[dragon.getPosition()].y;
            float vel = 100*deltaTime;
            
            if(initialX < finalX){
                while(initialX < finalX){
                    dragon.render(initialX,initialY,main.batch,stateTime,deltaTime);
                    initialX += vel;
                }
            }
            if(initialX > finalX){
                while(initialX > finalX){
                    dragon.render(initialX,initialY,main.batch,stateTime,deltaTime);
                    initialX -= vel;
                }
            }
            if(initialY < finalY){
                while(initialY < finalY){
                    dragon.render(initialX,initialY,main.batch,stateTime,deltaTime);
                    initialY += vel;
                }
            }
            if(initialY > finalY){
                while(initialY > finalY){
                    dragon.render(initialX,initialY,main.batch,stateTime,deltaTime);
                    initialY -= vel;
                }
            }
                    
        }
    }
            
    /**
     * Updates all the dragon's positions. Used every time the order layout changes.
     */
    private void updateDragonPositions(){
        int pos = 0;
        for(LinkedListNode node = dragons.getFirstNode(); node != null; node = node.getNextNode()){
            ((Dragon)node.getData()).setPosition(pos);
            pos++;
        }
    }
}

