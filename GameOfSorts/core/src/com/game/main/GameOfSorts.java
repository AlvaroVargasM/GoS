package com.game.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.GameOver;
import screens.GameScreen;
import screens.Menu;
import screens.GameOver;

/**
 * Main game class, from here the screens are displayed or disposed.
 * @author Luis Mariano Ramírez
 */
public class GameOfSorts extends Game{
        
    /**
     * Constant width of the game window.
     */
    public static final int winWidth = 1440;

    /**
     * Constant heigth of the game window.
     */
    public static final int winHeight = 864;
    
    /**
     * Main sprite batch, used for drawing sprites into the screen.
     */
    public SpriteBatch batch;
    
    @Override
    public void create () {
        batch = new SpriteBatch();
        this.setScreen(new Menu(this));
    }
    @Override
    public void render () {
        super.render();
    }
    @Override
    public void dispose () {
        batch.dispose();
    }
}
