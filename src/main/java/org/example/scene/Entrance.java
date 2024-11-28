package org.example.scene;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.dsl.FXGL;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Entrance {
    public static Entity create() {


        Entity Entrance = FXGL.entityBuilder()
                .at(400, 580)
                .view(new Rectangle(100, 20, Color.BROWN))
                .build();

        Entity person = FXGL.entityBuilder()
                .at(400, 490)
                .view(FXGL.getAssetLoader().loadTexture("girl2.png", 60, 80))
                .build();


        FXGL.getGameWorld().addEntity(person);

        return Entrance;
    }
}