
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


public class GameScreen implements Screen{
    
    private DragonRider rider = new DragonRider();
    public static float shootCoolDown= 0.3f;
    public float shootTimer;

    public Texture background;
    
    ArrayList<RiderShoot>riderShoots;
    ArrayList<EnemyShoot>enemyShoots;
    
    private Dragon[] dragons = new Dragon[20];
    private Point2D.Float[] dragonPositions = new Point2D.Float[20];
    
    float deltaTime;
    float stateTime;
    
    Main main;

    public GameScreen(Main game) {
        this.main = game;
        
        background = new Texture("castle.png");
        
        riderShoots = new ArrayList<RiderShoot>();
        enemyShoots = new ArrayList<EnemyShoot>();

        dragonPositions = setInitialPositions(dragonPositions);
    }
    
    @Override
    public void show() {}

    @Override
    public void render(float delta) {   
            Gdx.gl.glClearColor((float)253/255, (float)141/255, (float)127/255, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            
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
            
            rider.movement(deltaTime);
            

            for(RiderShoot rShoot: riderShoots){
                rShoot.update(deltaTime);
                for(EnemyShoot eShoot: enemyShoots){
                    if(rShoot.getSprite().overlaps(eShoot.getSprite())){
                        System.out.println("Choque");
                    }
                }
                
             
            }
            
            ArrayList<EnemyShoot> deadShoots = new ArrayList<EnemyShoot>();
            for(EnemyShoot shoot: enemyShoots){
             shoot.update(deltaTime);
             if(shoot.remove)deadShoots.add(shoot);
            }
           
            
            ArrayList<Dragon> deadDragons = new ArrayList<Dragon>();
            for(int i=0;i<20;i++){
                if(!(dragons[i]==null)){
                    dragons[i].update(deltaTime, (80*deltaTime));
                }
             //if(enemy.remove)deadDragons.add(enemy);
            }
            
            
            
            
            
            main.batch.begin();
            main.batch.draw(background, 0,0,1920,1080);
            
            rider.render(main.batch,stateTime,deltaTime);
            
            for(RiderShoot flame: riderShoots) flame.render(main.batch,stateTime);
            
            for(int i=0;i<20;i++){
                if(!(dragons[i]==null)){
                    dragons[i].render(main.batch,stateTime,deltaTime);
                    if(dragons[i].getShooting()){
                        enemyShoots.add(new EnemyShoot(dragons[i].getIsCommander(),dragons[i].getX()-20,dragons[i].getY()+15));
                        dragons[i].restartShoot();
                    }
                }
            }
            
            for(EnemyShoot shoot: enemyShoots){
                shoot.render(main.batch,stateTime);
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

