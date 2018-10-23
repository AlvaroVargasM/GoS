package com.game.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.game.main.GameOfSorts;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.foregroundFPS=60;
                config.width= GameOfSorts.winWidth ;
                config.height= GameOfSorts.winHeight;
                config.resizable = false;
		new LwjglApplication(new GameOfSorts(), config);
	}
}
