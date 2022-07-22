package com.magma.example.html.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.magma.engine.debug.MagmaLogger;
import com.magma.example.ExampleGame;
public class ExampleWebLauncher extends GwtApplication {
        @Override
        public GwtApplicationConfiguration getConfig () {
                MagmaLogger.init(new MagmaLogger("ExampleGame"));
                return new GwtApplicationConfiguration(true);
        }
        @Override
        public ApplicationListener createApplicationListener () {
                return new ExampleGame();
        }
}
