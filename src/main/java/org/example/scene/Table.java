package org.example.scene;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.dsl.FXGL;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public static List<Entity> createTables(int rows, int cols, int startX, int startY) {
        List<Entity> tables = new ArrayList<>();
        int separation = 40;
        int tableSize = 70;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Entity table = FXGL.entityBuilder()
                        .at(startX + col * (tableSize + separation), startY + row * (tableSize + separation))
                        .view(FXGL.getAssetLoader().loadTexture("tables.png", tableSize, tableSize))
                        .build();
                tables.add(table);
                FXGL.getGameWorld().addEntity(table);
            }
        }

        Entity mesera = FXGL.entityBuilder()
                .at(380,300)
                .view(FXGL.getAssetLoader().loadTexture("mesera.png", 50, 80))
                .build();

        Entity person = FXGL.entityBuilder()
                .at(510, 120)
                .view(FXGL.getAssetLoader().loadTexture("girl2.png", 60, 80))
                .build();

        FXGL.getGameWorld().addEntity(person);
        FXGL.getGameWorld().addEntity(mesera);

        Entity food = FXGL.entityBuilder()
                .at(475, 160)
                .view(FXGL.getAssetLoader().loadTexture("food.png", 30, 30))
                .build();

        FXGL.getGameWorld().addEntity(food);


        return tables;
    }
}
