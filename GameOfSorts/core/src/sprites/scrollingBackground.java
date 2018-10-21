
package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.awt.geom.Point2D;
import java.util.concurrent.ThreadLocalRandom;


public class scrollingBackground {
    
    Texture seamlessBackground, castle, cloud1, cloud2,sun;
    
    float bgX1,bgX2, castleX;
    
    private Point2D.Float[] clouds1 = new Point2D.Float[4];
    private Point2D.Float[] clouds2 = new Point2D.Float[4];

    int width = 1540;
    
    
    public scrollingBackground(){
        seamlessBackground = new Texture("seamlessBackground.png");
        castle = new Texture("passingCastle.png");
        cloud1 = new Texture("cloud1.png");
        cloud2 = new Texture("cloud2.png");
        sun = new Texture("sun.png");
      
        
        bgX1 = 0;
        bgX1 = width;
        
        castleX=0;
        
        for(int i=0; i< clouds1.length; i++){
            clouds1[i]= new Point2D.Float(random(500,900),random(0,750));
        }
        for(int i=0; i< clouds2.length; i++){
            clouds2[i]= new Point2D.Float(random(100,700),random(0,750));
        }
    }
    
    public void renderBackLayer(float deltaTime, SpriteBatch batch){
        
        if(bgX1 + width <= 0){
            bgX1 = bgX2 + width;
        }
        if(bgX2 + width <= 0){
            bgX2 = bgX1 + width;
        }
        if(castleX+width < 0){
            castleX = 1080 + random(800,1500);
        }
        for(int i=0; i< clouds1.length; i++){
            if(clouds1[i].x+width < 0){
                clouds1[i].x = 100+random(100,600);
                clouds1[i].y = random(0,750);
            }
        }
        
        for(int i=0; i< clouds2.length; i++){
            if(clouds2[i].x+width < 0){
                clouds2[i].x = 100+random(100,900);
                clouds2[i].y = random(0,750);
            }
        }
        
        bgX1 -= 300*deltaTime;
        bgX2 -= 300*deltaTime;
        castleX -= 200*deltaTime;
        for(int i=0; i< clouds1.length; i++) clouds1[i].x -= 120*deltaTime;
        for(int i=0; i< clouds2.length; i++) clouds2[i].x -= 150*deltaTime;
        
        batch.draw(seamlessBackground,bgX1, 0, 1540, 866);
        batch.draw(seamlessBackground,bgX2, 0, 1540, 866);
        batch.draw(sun,1000, 630, 210, 218);
        
        batch.draw(cloud2,clouds2[0].x, clouds2[0].y, 1540, 866);
        batch.draw(cloud2,clouds2[1].x, clouds2[1].y, 1540, 866);
        batch.draw(cloud2,clouds2[2].x, clouds2[2].y, 1540, 866);
        batch.draw(cloud2,clouds2[3].x, clouds2[3].y, 1540, 866);
    }
    
    public void renderFrontLayer(float deltaTime, SpriteBatch batch){
        batch.draw(castle,castleX, 0, 1540, 866);
        
        batch.draw(cloud1,clouds1[0].x, clouds1[0].y, 1540, 866);
        batch.draw(cloud1,clouds1[1].x, clouds1[1].y, 1540, 866);
        batch.draw(cloud1,clouds1[2].x, clouds1[2].y, 1540, 866);
        batch.draw(cloud1,clouds1[3].x, clouds1[3].y, 1540, 866);
    }
    
    public int random(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
