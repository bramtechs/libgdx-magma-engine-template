package com.magma.example.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.magma.engine.debug.Debugger;
import com.magma.engine.debug.MagmaLoggerDesktop;
import com.magma.engine.debug.MagmaLogger;
import com.magma.engine.desktop.MagmaLauncher;
import com.magma.example.ExampleGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher extends MagmaLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setWindowSizeLimits(640, 480, -1, -1);
        config.setWindowedMode((int) (640 * 1.5), (int) (480 * 1.5));
        config.setResizable(true);
        // config.setWindowIcon("assets/space/icon.png");
        config.setForegroundFPS(60);
        MagmaLogger.init(new MagmaLoggerDesktop("ExampleGame"));
        new DesktopLauncher().launch(config, arg);
    }
    @Override
    protected Game createNewGame() {
        return new ExampleGame();
    }
}
