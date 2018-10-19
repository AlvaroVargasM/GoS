package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.Main;

public class Menu implements Screen{
    
    private static int playWidth = 330;
    private static int playHeight = 150;
    private static int play_X;
    private static final int play_Y = 400;
    
   
    private static int exitWidth = 300;
    private static int exitHeight = 150;
    private static int exit_X;
    private static final int exit_Y = 100;
    
    Main game;
    Texture playTexture, exitTexture, exitOn, exitOff, playOn, playOff;
    Rectangle playRectangle, exitRectangle;
    Boolean hoverPlay, hoverExit;
    
    public Menu(Main game){
        this.game =game;
        playTexture = new Texture("play_button_inactive.png");
        playOn = new Texture("play_button_active.png");
        playOff = new Texture("play_button_inactive.png");
        play_X = (Main.winWidth-playWidth)/2;
        playRectangle = new Rectangle(play_X,(Main.winHeight-play_Y)-playHeight,playWidth,playHeight); 
        
        exitTexture = new Texture("exit_button_inactive.png");
        exitOn = new Texture("exit_button_active.png");
        exitOff = new Texture("exit_button_inactive.png");
        exit_X = (Main.winWidth-exitWidth)/2;
        exitRectangle = new Rectangle(exit_X,(Main.winHeight-exit_Y)-exitHeight,exitWidth,exitHeight);
    }
            
    
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        
        hoverPlay = (playRectangle.contains(Gdx.input.getX(), Gdx.input.getY()));
        hoverExit = (exitRectangle.contains(Gdx.input.getX(), Gdx.input.getY()));
        
        playTexture = hoverPlay ? playOn: playOff;
        exitTexture = hoverExit ? exitOn: exitOff;
                
        game.batch.draw(playTexture, play_X ,play_Y, playWidth, playHeight);
        game.batch.draw(exitTexture, exit_X ,exit_Y, exitWidth, exitHeight);
        
        if(Gdx.input.isTouched()){
           if(hoverPlay){this.dispose(); game.setScreen(new GameScreen(game));}
           if(hoverExit) Gdx.app.exit();
        }
        
        game.batch.end();
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

