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


public class GameOfSorts extends Game{
        
        public static final int winWidth = 1440;
        public static final int winHeight = 864;
    
        public SpriteBatch batch;
    
	@Override
	public void create () {
            
            batch = new SpriteBatch();
            this.setScreen(new GameScreen(this));
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
