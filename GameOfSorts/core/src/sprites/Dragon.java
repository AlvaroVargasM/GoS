package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Generic dragon class. Contains all the general methods and atributes used by all the dragons implemented classes.
 * @author Luis Mariano Ramírez Segura
 */
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
    private int life;
    private String dragonSprite;
    private Animation animation;
    private boolean isCommander;
    private boolean shooting;
    private boolean remove = false;
    private static int[] usedAges = new int[20];
    
    /**
     * Generic dragon class constructor.
     * @param dragonClass Specifies the class of the dragon.
     * @param position The dragon's intial position for layout display.
     */
    public Dragon(String dragonClass, int position){
        
        if(position ==0 ){
            for(int i=0; i<usedAges.length; i++) usedAges[i]=0;
        }
        this.name = randomName();

        this.position=position;
        this.dragonClass= dragonClass;
        isCommander = (dragonClass.equals("commander")) ? true: false;
        this.shootCharge = 0;      
   
        boolean ageRegistered=false;
        while(!ageRegistered){
            int age = rand(1,1000);
            boolean ageUsed=false;
            for(int i=0; i< usedAges.length; i++){
                if(age == usedAges[i]){
                    ageUsed = true;
                }
            }
            if(!ageUsed){
                usedAges[position] = age;
                this.age = age;
                ageRegistered =true;
            }
        }
        
        this.chargeSpeed = rand(1,10);
        this.dragonSprite = (isCommander) ? "dracoR.png" : (dragonClass.equals("captain")) ? "dracoG.png" : "dracoS.png";
        this.resistance = (isCommander) ? 3: (dragonClass.equals("captain")) ? 2: 1;  
        this.life=resistance;
        this.size = (isCommander) ? 128: 96;
        TextureRegion[][] dragonSpriteSheet = TextureRegion.split(new Texture(dragonSprite), this.size, this.size);
        this.animation = new Animation(0.15f, (Object[]) dragonSpriteSheet[1]);
    }
    
    /**
     * Returns a five digit randome name.
     */
    public String randomName(){
         String[] vowels = {"a","e","i","o","u"};
         String[] syllables = {"q","w","r","t","y","p","s","d","f","g","h","j",
                               "k","l","z","x","c","v","b","n","m"};
         
         String char1 = syllables[rand(0, 20)];
         String char2 = vowels[rand(0, 4)];
         String char3 = syllables[rand(0, 20)];
         String char4 = vowels[rand(0, 4)];
         String char5 = syllables[rand(0, 20)];
         
         return char1+char2+char3+char4+char5;
     }
    
    /**
     * Returns a random integer between two numbers
     * @param min Minimum number of the range.
     * @param max Maximum number of the range.
     */
    private int rand(int min, int max){ 
         return ThreadLocalRandom.current().nextInt(min, max + 1);
     }
    
    /**
     * Renders on the screen the dragon sprite.
     * @param x Dragon's current location on the x axis.
     * @param y Dragon's current location on the y axis.
     * @param batch Game's rendering batch.
     * @param stateTime Current delta time state, used for animation rendering.
     * @param deltaTime Game's delta time.
     */
    public void render(float x, float y, SpriteBatch batch, float stateTime, float deltaTime){
        
        if(x<0) remove=true;
        this.x = x;
        this.y = y;
        batch.draw((TextureRegion) animation.getKeyFrame(stateTime, true), x, y, size, size);
        
        shootCharge+=deltaTime;
        if(shootCharge > (float)chargeSpeed && !(shooting)){
            shootCharge=0;
            this.shooting = true;
        }
    }
    
    /**
     * Returns the dragon area in shape of a rectangle, used for collision detection.
     * @return A rectangle with the sprite area.
     */
    public Rectangle getSprite(){
        return new Rectangle((int)x,(int)y,size,size);
    }
    
    /**
     * Restart the shooting condition.
     */
    public void restartShoot(){ 
        shooting =false;
    }

    /**
     * Diminishes the life of the dragon in one.
     */
    public void hit(){
        life-=1;
    }

    /**
     * Returns the current dragon life.
     * @return Dragon life.
     */
    public int getLife(){
        return life;
    }
    
    /**
     * Sets the dragon position variable value.
     * @param position New position fo the dragon.
     */
    public void setPosition(int position) { 
        this.position = position; 
    }

    /**
     * Returns the dragon current position.
     * @return Dragon position.
     */
    public int getPosition() { 
        return position; 
    }

    /**
     * Sets the value of the father variable.
     * @param father Dragon's father name.
     */
    public void setFather(String father) { 
        this.father = father; 
    }

    /**
     * Returns the dragon x location.
     * @return Current dragon x location.
     */
    public float getX(){
        return x;
    }

    /**
     * Returns the dragon y location.
     * @return Current dragon y location.
     */
    public float getY(){
        return y;
    }

    /**
     * Indicates if the dragon is currently able to shoot or not.
     * @return The boolean state of the shooting variable.
     */
    public boolean getShooting(){ 
        return shooting;
    }

    /**
     * Indicates if the dragon's class is commander.
     * @return The boolean value of the variable isCommander.
     */
    public boolean getIsCommander(){
        return isCommander;
    }

    /**
     * Returns the dragon class.
     * @return Dragon class.
     */
    public String getDragonClass() { 
        return dragonClass; 
    }

    /**
     * Returns the dragon's name.
     * @return Dragon's name.
     */
    public String getName() { 
        return name; 
    }

    /**
     * Returns the dragon's father name.
     * @return Dragon's father name.
     */
    public String getFather() {
        return father; 
    }

    /**
     * Returns the dragon's age.
     * @return Dragon's age.
     */
    public int getAge() { 
        return age; 
    }

    /**
     * Returns the dragon's charge speed. It goes from 1 to 100.
     * @return Dragon's charge speed.
     */
    public int getChargeSpeed() { 
        return chargeSpeed;
    }

    /**
     * Returns the dragon's resistance. Depending of the dragon class, it goes from 1 to 3.
     * @return Dragon' resistance.
     */
    public int getResistance() { 
        return resistance;
    }
}
