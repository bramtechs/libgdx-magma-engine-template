package com.magma.example.stages;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.magma.engine.MagmaGame;
import com.magma.engine.stages.GameStage;
import com.magma.engine.stages.ViewportContext;

public class ExampleStage extends GameStage {
    public ExampleStage(ViewportContext viewports, SpriteBatch batch){
        super(viewports,batch);
        MagmaGame.setBackgroundColor(Color.ORANGE);
    }

}
