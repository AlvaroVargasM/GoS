package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import java.util.concurrent.ThreadLocalRandom;
import static sprites.DragonRider.size;

public abstract class Dragon {
    
    private int position;
    
    private float x,y;
    private int size;
   
    private String dragonClass;
    private String name;
    private String father;
    
    private int age;
    
    private float shootCharge; 
    private int chargeSpeed;
    
    private int resistance;
    
    private String dragonSprite;
    private Animation animation;
    
    private boolean isCommander;
    
    private boolean shooting;
    public boolean remove = false;
    
    public Dragon(String name, String dragonClass, float x,float y){
        
        this.dragonClass= dragonClass;
        isCommander = (dragonClass.equals("commander")) ? true: false;
        this.x=x;
        this.y=y;
        this.shootCharge = 0;
        
        this.age = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        this.chargeSpeed = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        this.resistance = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        
        this.dragonSprite = (isCommander) ? "dracoR.png" : (dragonClass.equals("captain")) ? "dracoG.png" : "dracoS.png";
        this.size = (isCommander) ? 128: 96;
        
        TextureRegion[][] dragonSpriteSheet = TextureRegion.split(new Texture(dragonSprite), this.size, this.size);
        this.animation = new Animation(0.15f, dragonSpriteSheet[1]);
    }

    public void update(float deltaTime, float moveLeft){
        x -= moveLeft;
        shootCharge+=deltaTime;
        
        if(x<0) remove=true;
    }
    
    public void render(SpriteBatch batch, float stateTime, float deltaTime){
        batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), x, y, size, size);
        
        if(shootCharge > (float)chargeSpeed && !(shooting)){
            shootCharge=0;
            this.shooting = true;
        }
    }
    
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,size,size);
    }
    
    public void restartShoot(){ shooting =false;}
    public int getPosition() { return position; }
    public void setFather(String father) { this.father = father; }
    public void setPosition(int position) { this.position = position; }
    public float getX(){return x;};
    public float getY(){return y;};
    public boolean getShooting(){ return shooting;}
    public boolean getIsCommander(){ return isCommander;}
    public String getDragonClass() { return dragonClass; }
    public String getName() { return name; }
    public String getFather() { return father; }
    public int getAge() { return age; }
    public int getChargeSpeed() { return chargeSpeed; }
    public int getResistance() { return resistance; }
}
