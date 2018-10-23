
package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.game.main.GameOfSorts;

public class GameOver implements Screen{
    
    private Animation[] title;
    
    float stateTime;
    
    private Texture background;
    
    private static int optionWidth = 278;
    private static int optionHeight = 152;
    private static int againX;
    private static int exitX;
    
    GameOfSorts main;
    Texture  againTexture, exitTexture, exitOn, exitOff, againOn, againOff;
    Rectangle againRectangle, exitRectangle;
    Boolean hoverAgain, hoverExit;
    
    BitmapFont font;
    int horde;
    
    
    public GameOver(GameOfSorts game, int horde){
        
        this.main =game;
        
        title = new Animation[1];
        
        
        /*FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("pix2.ttf"));
        FreeTypeFontParameter parameter = new FreeTypeFontParameter();
        parameter.size = 300;
        parameter.characters = "0123456789";
        font = generator.generateFont(parameter);
        font.setColor(new Color(Color.GOLD));*/
        
        this.horde = horde;
        
        TextureRegion[][] titleSprite = TextureRegion.split(new Texture("gameOverTitle.png"), 1442, 208);
        title[0] = new Animation(0.15f, titleSprite[0]);
        
        againTexture = new Texture("tryAgainOff.png");
        againOn = new Texture("tryAgainOn.png");
        againOff = new Texture("tryAgainOff.png");
        againX = ((GameOfSorts.winWidth-optionWidth)/2)-450;
        againRectangle = new Rectangle(againX,(GameOfSorts.winHeight-100)-optionHeight,optionWidth,optionHeight); 
        
        exitTexture = new Texture("exitOff2.png");
        exitOn = new Texture("exitOn2.png");
        exitOff = new Texture("exitOff2.png");
        exitX = ((GameOfSorts.winWidth-optionWidth)/2)+450;
        exitRectangle = new Rectangle(exitX,(GameOfSorts.winHeight-100)-optionHeight,optionWidth,optionHeight);
        
        background = new Texture("GameOverBackground.png");
        
    }
            
    
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        main.batch.begin();
        
        main.batch.draw(background,0,0,1442,866);
        
        hoverAgain = (againRectangle.contains(Gdx.input.getX(), Gdx.input.getY()));
        hoverExit = (exitRectangle.contains(Gdx.input.getX(), Gdx.input.getY()));
        
        againTexture = hoverAgain ? againOn: againOff;
        exitTexture = hoverExit ? exitOn: exitOff;
      
        main.batch.draw(againTexture, againX ,100, optionWidth,optionHeight);
        main.batch.draw(exitTexture, exitX ,100, optionWidth,optionHeight);
        
        stateTime += Gdx.graphics.getDeltaTime();
        main.batch.draw((TextureRegion) title[0].getKeyFrame(stateTime, true), 0, 600, 1442, 208);

        String showHorde = ""+horde;
        //font.draw(main.batch, showHorde, (Main.winWidth-optionWidth)/2 + 100 - (100*showHorde.length()), 470);
        
        if(Gdx.input.isTouched()){
           if(hoverAgain){this.dispose(); main.setScreen(new GameScreen(main));}
           if(hoverExit) Gdx.app.exit();
        }
        main.batch.end();
    }

    @Override
    public void resize(int width, int height) {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}
    @Override
    public void dispose() {} 
}
