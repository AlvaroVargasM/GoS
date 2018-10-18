
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;


public class DragonRider {
    float x,y;
    public static int size = 96;
    int knightSpeed = 250;
    private Animation[] knightAnimations;
    private int knightPose;
    
    public DragonRider(){
        y = 480;
        x = 50;
        knightPose = 2;
        knightAnimations = new Animation[5];
        TextureRegion[][] knightSpriteSheet = TextureRegion.split(new Texture("rider.png"), size, size);
        for(int i=0;i<4;i++)knightAnimations[i] = new Animation(0.15f, knightSpriteSheet[i]);
    }
    
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
            }         
            if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                x-=knightSpeed*deltaTime;
                if(x<0)x=0;
                knightPose = 1;
            }
            if(!(Gdx.input.isKeyPressed(Input.Keys.LEFT)) && !(Gdx.input.isKeyPressed(Input.Keys.DOWN)) && !(Gdx.input.isKeyPressed(Input.Keys.UP)))knightPose=2;
    }
    
    public void render(SpriteBatch batch, float stateTime, float deltaTime){
        batch.draw((TextureRegion) knightAnimations[knightPose].getKeyFrame(stateTime, true), x, y, size, size);
    }
    
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,size,size);
    }
    
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
}
