
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author luism
 */
public class DragonRider {
    float x,y;
    private static int size = 90 ;
    int knightSpeed = 250;
    private Animation[] knightAnimations;
    private Animation[] hearts;
    private int knightPose;

    /**
     *
     */
    public int life=3;
    
    /**
     *
     */
    public DragonRider(){
        y = 480;
        x = 50;
        knightPose = 2;
        knightAnimations = new Animation[5];
        hearts = new Animation[1];
        TextureRegion[][] knightSpriteSheet = TextureRegion.split(new Texture("riderZ.png"), 96, 96);
        for(int i=0;i<4;i++)knightAnimations[i] = new Animation(0.15f, (Object[])  knightSpriteSheet[i]);
        TextureRegion[][] heartSprite = TextureRegion.split(new Texture("heartX.png"), 640, 640);
        hearts[0] = new Animation(0.15f,(Object[]) heartSprite[0]);
    }
    
    public int sumar(int n1, int n2){ return n1+n2; }
    
    /**
     *
     * @param deltaTime
     */
    public void movement(float deltaTime){
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
                y+=knightSpeed*deltaTime;
                if(y+size > Gdx.graphics.getHeight()) y = Gdx.graphics.getHeight()-size;
                knightPose=3;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
                y-=knightSpeed*deltaTime;
                if(y<0)y=0;
                knightPose=0;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
                x+=knightSpeed*deltaTime;
                if(x+size > Gdx.graphics.getWidth()) x = Gdx.graphics.getWidth()-size;
                knightPose=2;
            }         
            if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                x-=knightSpeed*deltaTime;
                if(x<0)x=0;
                knightPose = 1;
            }

    }
    
    /**
     *
     * @param batch
     * @param stateTime
     * @param deltaTime
     */
    public void render(SpriteBatch batch, float stateTime, float deltaTime){
        batch.draw((TextureRegion) knightAnimations[knightPose].getKeyFrame(stateTime, true), x, y, size, size);
        
        int heartX = -10;
        for(int i=0;i<life;i++){
            heartX += 60;
            batch.draw((TextureRegion) hearts[0].getKeyFrame(stateTime, true), heartX, 784, 50, 50);
        } 
    }
    
    /**
     *
     * @return
     */
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,size,size);
    }
    
    /**
     *
     * @return
     */
    public float getX() {
        return x;
    }

    /**
     *
     * @return
     */
    public float getY() {
        return y;
    }
    
    /**
     *
     */
    public void hit(){
       life-=1;
   }

    /**
     *
     * @return
     */
    public String getOrientation() {
        String orientation = (knightPose == 2) ? "right": (knightPose == 1) ? "left": (knightPose == 3) ? "up": "down";
        return orientation;
    }
}
