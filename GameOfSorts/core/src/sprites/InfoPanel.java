
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.mygdx.game.Main;

public class InfoPanel {
    
    Texture panel;
    String layout, name, dracoClass, age, father, resistance, fireVelocity, classAtribute;
    int x;
    String[] subDragons = new String[6];
    BitmapFont font, font2;
    
    public InfoPanel(){
        panel = new Texture("info.png");
        x=1270;
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("pix2.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 18;
        parameter.characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        font = generator.generateFont(parameter);
        parameter.size = 20;
        font2 = generator.generateFont(parameter);
        font.setColor(Color.BLACK);
        font2.setColor(Color.WHITE);
        
        layout = name = dracoClass = age = father = resistance = fireVelocity = classAtribute= "AAAA";
        
        for(int i=0; i<subDragons.length;i++) subDragons[i]="BBBBBB";
    }
    
    public void render(float deltaTime, SpriteBatch batch){
        batch.draw(panel,1249,0, 206, 864);
        font.draw(batch,name, x, 735);
        font.draw(batch,dracoClass, x, 670);
        font.draw(batch,age, x, 610);
        font.draw(batch,resistance, x, 547);
        font.draw(batch,fireVelocity, x, 483);
        font.draw(batch,father, x, 421);
        font2.draw(batch,classAtribute, x-18, 380);
        
        int tempY = 354;
        for(int i = 0; i < subDragons.length; i++){
            font.draw(batch,subDragons[i], x, tempY);
            tempY -= 18;
        }
    }
    
    public void setDragonInfo(Dragon dragon){
        for(int i=0; i<subDragons.length;i++) subDragons[i]="";
        
        this.name = dragon.getName();
        this.dracoClass = dragon.getDragonClass();
        this.age = ""+dragon.getAge();
        this.father = dragon.getFather();
        this.resistance = ""+dragon.getResistance();
        this.fireVelocity = ""+dragon.getChargeSpeed();
        this.classAtribute = (dracoClass.equals("infantry")) ? "Captained by" : "Superior of";
        
        if(dracoClass.equals("infantry")){
            Infantry draco = (Infantry) dragon;
            this.subDragons[0] = draco.getCaptain();
        }else if(dracoClass.equals("captain")){
            Captain draco = (Captain)dragon;
            for(int i=0; i<subDragons.length;i++){
                if(draco.getInfantryInCommand()[i] != null){
                    subDragons[i] = draco.getInfantryInCommand()[i];
                }
            }
        }else{
            Commander draco = (Commander)dragon;
            for(int i=0; i<subDragons.length;i++){
                if(draco.getDragonsInCommand()[i] != null){
                    subDragons[i] = draco.getDragonsInCommand()[i];
                }
            }
        }
    }
}
