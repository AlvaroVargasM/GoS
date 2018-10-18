package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.GameScreen;


public class Main extends Game{
        
        public static final int winWidth = 1440;
        public static final int winHeight = 960;
    
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
