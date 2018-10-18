
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;


public class RiderShoot {
    
    public int speed = 500;
    public Animation animation;
    public float x,y;
    
    public boolean remove = false;
    
    public RiderShoot(float x,float y){
        this.x=x;
        this.y=y;
        
        TextureRegion[][] blueFireSpriteSheet = TextureRegion.split(new Texture("blueFire.png"), 132, 98);
        animation = new Animation(0.10f, blueFireSpriteSheet[0]); 
    }
    
    public void update(float deltaTime){
        x += speed*deltaTime;
        if(x>Gdx.graphics.getWidth()) remove=true;
    }
    
    public void render(SpriteBatch batch, float stateTime){
        batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), x, y, 66, 49);
    }
    
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,66,49);
    }
}
