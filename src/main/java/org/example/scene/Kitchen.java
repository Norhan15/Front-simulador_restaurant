package org.example.scene;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.dsl.FXGL;

public class Kitchen {
    public static Entity create() {

        Entity kitchen = FXGL.entityBuilder()
                .at(80,50)
                .view(FXGL.getAssetLoader().loadTexture("kitchen.png", 300, 200))
                .build();

        Entity chef = FXGL.entityBuilder()
                .at(40,168)
                .view(FXGL.getAssetLoader().loadTexture("chef.png", 50, 80))
                .build();

        FXGL.getGameWorld().addEntity(chef);

        return kitchen;
    }
}
