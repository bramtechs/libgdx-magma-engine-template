package com.magma.example;

import com.magma.example.stages.ExampleStage;
import com.magma.engine.MagmaGame;
import com.magma.engine.maps.MapStage;
import com.magma.engine.stages.StageSwitcher;
import com.magma.engine.stages.ViewportContext;

public class ExampleGame extends MagmaGame {

    public ExampleGame() {
        super("example/");
    }

    @Override
    protected void initStages() {
        ViewportContext viewports = ViewportContext.createRetro(40, 30, 640, 480);

        // open a stage with StageSwitcher here
        ExampleStage stage = new ExampleStage(viewports,batch);
        StageSwitcher.open(stage);
    }
}
