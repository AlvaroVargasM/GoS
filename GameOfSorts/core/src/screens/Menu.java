package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.Main;

public class Menu implements Screen{
    
    private Texture background;
    
    private static int optionWidth = 278;
    private static int optionHeight = 152;
    private static int play_X;
    private static final int play_Y = 400;
    
    private static int exit_X;
    private static final int exit_Y = 100;
    
    Main main;
    Texture title, playTexture, exitTexture, exitOn, exitOff, playOn, playOff;
    Rectangle playRectangle, exitRectangle;
    Boolean hoverPlay, hoverExit;
    
    public Menu(Main game){
        this.main =game;
        
        background = new Texture("castle.png");
        
        title = new Texture("title.png");
        playTexture = new Texture("playOff.png");
        playOn = new Texture("playOn.png");
        playOff = new Texture("playOff.png");
        play_X = (Main.winWidth-optionWidth)/2;
        playRectangle = new Rectangle(play_X,(Main.winHeight-play_Y)-optionHeight,optionWidth,optionHeight); 
        
        exitTexture = new Texture("exitOff.png");
        exitOn = new Texture("exitOn.png");
        exitOff = new Texture("exitOff.png");
        exit_X = (Main.winWidth-optionWidth)/2;
        exitRectangle = new Rectangle(exit_X,(Main.winHeight-exit_Y)-optionHeight,optionWidth,optionHeight);
        
    }
            
    
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        main.batch.begin();
        
        main.batch.draw(background,-2300,-3100,5000,4000);
        main.batch.draw(background,-800,-1100,2620,1780);
        
        hoverPlay = (playRectangle.contains(Gdx.input.getX(), Gdx.input.getY()));
        hoverExit = (exitRectangle.contains(Gdx.input.getX(), Gdx.input.getY()));
        
        playTexture = hoverPlay ? playOn: playOff;
        exitTexture = hoverExit ? exitOn: exitOff;
        
        main.batch.draw(title, 100 ,650, 1284,124);        
        main.batch.draw(playTexture, play_X ,play_Y, optionWidth,optionHeight);
        main.batch.draw(exitTexture, exit_X ,exit_Y, optionWidth,optionHeight);
        
        if(Gdx.input.isTouched()){
           if(hoverPlay){this.dispose(); main.setScreen(new GameScreen(main));}
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

