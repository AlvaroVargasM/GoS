
package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Information panel made to display dragon stats, layout and tree visualization.  
 * @author Luis Mariano Ramírez Segura
 */
public class InfoPanel {
    
    Texture panel;
    String layout, name, dracoClass, age, father, resistance, fireVelocity, classAtribute;
    int x;
    String[] subDragons = new String[6];
    BitmapFont font, font2;
    BitmapFont blackFont, whiteFont, layoutFont;
    
    /**
     * InfoPanel class constructor.
     */
    public InfoPanel(){
        panel = new Texture("info.png");
        x=1270;
        blackFont = new BitmapFont(Gdx.files.internal("fontS.fnt"));
        whiteFont = new BitmapFont(Gdx.files.internal("fontL.fnt"));
        layoutFont = new BitmapFont(Gdx.files.internal("fontLayout.fnt"));
        layout="Non specific";
        name = dracoClass = age = father = resistance = fireVelocity = classAtribute= "";
        for(int i=0; i<subDragons.length;i++) subDragons[i]="";
    }
    
    /**
     * Initial render of the panel, the dragon stats are empty.
     * @param deltaTime Game's delta time.
     * @param batch Game screen rendering sprite batch.
     */
    public void render(float deltaTime, SpriteBatch batch){
        batch.draw(panel,1249,0, 206, 864);
        layoutFont.draw(batch, new GlyphLayout(layoutFont, layout), x-16, 825);
        whiteFont.draw(batch, new GlyphLayout(whiteFont, classAtribute), x-18, 380);
        blackFont.draw(batch, new GlyphLayout(blackFont, name), x, 735);
        blackFont.draw(batch, new GlyphLayout(blackFont, dracoClass), x, 670);
        blackFont.draw(batch, new GlyphLayout(blackFont, age), x, 610);
        blackFont.draw(batch, new GlyphLayout(blackFont, resistance), x, 547);
        blackFont.draw(batch, new GlyphLayout(blackFont, fireVelocity), x, 483);
        blackFont.draw(batch, new GlyphLayout(blackFont, father), x, 421);
        int tempY = 354;
        for(int i = 0; i < subDragons.length; i++){
            blackFont.draw(batch, new GlyphLayout(blackFont, subDragons[i]), x, tempY);
            tempY -= 18;
        }
    }
    
    /**
     * Recieves a dragon class object, subtracts his data and updates de information panel with it.
     * @param dragon A geneneric dragon class.
     */
    public void setDragonInfo(Dragon dragon){
        for(int i=0; i<subDragons.length;i++) subDragons[i]="";
        this.name = dragon.getName();
        this.dracoClass = dragon.getDragonClass();
        this.age = ""+dragon.getAge();
        
        this.father = (dragon.getFather()) == null ? "Orphan": dragon.getFather();
        this.resistance = ""+dragon.getResistance();
        this.fireVelocity = ""+(dragon.getChargeSpeed()*10);
        this.classAtribute = (dracoClass.equals("infantry")) ? "Captained by" : "Superior of";

        if(dracoClass.equals("infantry")){
            Infantry draco = (Infantry) dragon;
            this.subDragons[0] = draco.getCaptain();
        }else if(dracoClass.equals("captain")){
            Captain draco = (Captain)dragon;
            for(int i=0; i<draco.getInfantryInCommand().length;i++) subDragons[i] = draco.getInfantryInCommand()[i];     
        }else{
            Commander draco = (Commander)dragon;
            for(int i=0; i<draco.getDragonsInCommand().length;i++) subDragons[i] = draco.getDragonsInCommand()[i];
        }
    }
    
    /**
     * Sets the string displayed in the layout text field.
     * @param layout A string specifying the current dragon layout.
     */
    public void setLayout(String layout){
        this.layout=layout;
    } 
}
