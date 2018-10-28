
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * Class that manages the flames fired by the enemies.
 * @author Luis Mariano Ramírez Segura
 */
public class EnemyShoot {
    
    private int speed = 400;
    private Animation animation;
    private float x,y;
    private float animationSpeed;
    private boolean remove = false;
    
    /**
     * Enemy shoot class constructor.
     * @param commander Specifies if the dragon being create is a commander or not.
     * @param x Flame's initial x location.
     * @param y Flame's initial y location.
     */
    public EnemyShoot(boolean commander, float x,float y){
        this.x=x;
        this.y=y;
        TextureRegion[][] spriteSheet = (commander) ? TextureRegion.split(new Texture("skullShoot.png"), 166, 139): TextureRegion.split(new Texture("redFire.png"), 255, 126);
        animationSpeed= (commander) ? 0.06f: 0.08f;
        animation = new Animation(animationSpeed, spriteSheet[0]); 
    }
    
    /**
     * Updates the shoot coordinates.
     * @param deltaTime Game's delta time.
     */
    public void update(float deltaTime){
        x -= speed*deltaTime;
        if(x>Gdx.graphics.getWidth()) remove=true;
    }
    
    /**
     * Renders on the screen the enemy fire ball sprite.
     * @param batch Game's rendering batch.
     * @param stateTime Current delta time state, used for animation rendering.
     */
    public void render(SpriteBatch batch, float stateTime){
        batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), x, y, 80, 63);
    }
    
    /**
     * Returns the fire ball area in shape of a rectangle, used for collision detection.
     * @return A rectangle with the sprite area.
     */
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,80, 63);
    }
}
