
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * Class that manages the flames fired by the knight dragon.
 * @author Luis Mariano Ramírez Segura
 */
public class RiderShoot {
    
    private int speed = 500;
    private Animation animation;
    private float x,y;
    private String orientation;
    private int rotation;
    private int[] offSets = new int[2];
    private boolean remove = false;
    
    /**
     * Rider shoot class constructor.
     * @param x Flame's initial x location.
     * @param y Flame's initial y location.
     * @param orientation Sprite rotation.
     */
    public RiderShoot(float x,float y, String orientation){
        this.x=x;
        this.y=y;
        this.orientation = orientation;
        this.rotation = (orientation.equals("left")) ? 180: (orientation.equals("up")) ? 90: (orientation.equals("down")) ? -90 : 0;
        this.offSets[0] = 30;
        this.offSets[1] = 15;
        TextureRegion[][] blueFireSpriteSheet = TextureRegion.split(new Texture("blueFire.png"), 132, 98);
        animation = new Animation(0.10f, (Object[]) blueFireSpriteSheet[0]); 
    }
    
    /**
     * Updates the shoot coordinates.
     * @param deltaTime Game's delta time.
     */
    public void update(float deltaTime){
        switch(rotation){
                case 0: 
                    x += speed*deltaTime;
                    if(x>Gdx.graphics.getWidth()) remove=true;
                    offSets[0] = 45;
                    offSets[1] = 15;
                    break;
                case 180: 
                    x -= speed*deltaTime;
                    if(x<0) remove=true;
                    offSets[0] = 55;
                    offSets[1] = 75;
                    break;
                case -90: 
                    y -= speed*deltaTime;
                    if(y<0) remove=true;
                    offSets[0] = 22;
                    offSets[1] = 55;
                    break;
                case 90:
                    y += speed*deltaTime;
                    if(y>Gdx.graphics.getHeight()) remove=true;
                    offSets[0] = 75;
                    offSets[1] = 15;
                    break;    
        }
    }
    
    /**
     * Renders on the screen the knight fire ball sprite.
     * @param batch Game's rendering batch.
     * @param stateTime Current delta time state, used for animation rendering.
     */
    public void render(SpriteBatch batch, float stateTime){
        batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), x + offSets[0], y + offSets[1], 0, 0, 66, 49, 1, 1, rotation);
    }
    
    /**
     * Returns the fire ball area in shape of a rectangle, used for collision detection.
     * @return A rectangle with the sprite area.
     */
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,66,49);
    }
}
