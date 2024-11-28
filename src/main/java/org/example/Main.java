package org.example;

import java.util.List;

import org.example.scene.Entrance;
import org.example.scene.Kitchen;
import org.example.scene.Reception;
import org.example.scene.Table;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;

public class Main extends GameApplication {

    private List<Entity> tables;
    private Entity kitchen;
    private Entity reception;
    private Entity entrance;

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Restaurant Simulation");
    }

    @Override
    protected void initGame() {

        FXGL.getGameScene().setBackgroundRepeat("floor.png");

        // Create the entrance
        entrance = Entrance.create();
        FXGL.getGameWorld().addEntity(entrance);

        // Create the reception
        reception = Reception.create();
        FXGL.getGameWorld().addEntity(reception);

        // Create the kitchen
        kitchen = Kitchen.create();
        FXGL.getGameWorld().addEntity(kitchen);

        // Create 9 tables
        tables = Table.createTables(5, 4, 350, 50);
        tables.forEach(FXGL.getGameWorld()::addEntity);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
