
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;



public class EnemyShoot {
    
    private int speed = 400;
    private Animation animation;
    private float x,y;
    private float animationSpeed;
    
    public boolean remove = false;
    
    public EnemyShoot(boolean commander, float x,float y){
        this.x=x;
        this.y=y;
        
        TextureRegion[][] spriteSheet = (commander) ? TextureRegion.split(new Texture("skullShoot.png"), 166, 139): TextureRegion.split(new Texture("redFire.png"), 255, 126);
        animationSpeed= (commander) ? 0.06f: 0.08f;
        
        animation = new Animation(animationSpeed, spriteSheet[0]); 
    }
    
    public void update(float deltaTime){
        x -= speed*deltaTime;
        if(x>Gdx.graphics.getWidth()) remove=true;
    }
    
    public void render(SpriteBatch batch, float stateTime){
        batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), x, y, 86, 69);
    }
    
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,86, 69);
    }
}
