package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.SpaceBubbles.entities.soortPlaneet;
import com.github.hanyaeger.SpaceBubbles.entities.Planeet;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class GameScene extends DynamicScene {
    public int id;
    public String name;
    private final ArrayList<Planeet> planeten = new ArrayList<>();


    public GameScene(int sceneId, String name) {
        id = sceneId;
        this.name = name;
    }

    public GameScene() {

    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/levelmusic.mp3");
        setBackgroundImage("backgrounds/space.jpg");
    }

    @Override
    public void setupEntities() {
        var xPos = 30;
        for (var location : this.planeten) {
            xPos += 40;
        }

        for (int i = 0; i < 10; i++) {
            var planeet = getPlaneet(xPos, i);
            planeten.add(planeet);
            addEntity(planeet);
        }


    }
// Heb het zo aangepast dat je maar een class hebt voor planeten in te spawnen en in deze switch dus de afbeelding meegeeft als variabel.
    private Planeet getPlaneet(int xPos, int i) {
        int type = ThreadLocalRandom.current().nextInt(0, 3);
        return switch (type) {
            case 0 -> new soortPlaneet(
                    new Coordinate2D(xPos + i * 50, 50), "sprites/mars.png"
            );
            case 1 -> new soortPlaneet(
                    new Coordinate2D(xPos + i * 50, 50), "sprites/earth.png"
            );
            case 2 -> new soortPlaneet(
                    new Coordinate2D(xPos + i * 50, 50), "sprites/venus.png"
            );
            default -> new soortPlaneet(
                    new Coordinate2D(xPos + i * 50, 50), "mars.png"
            );
        };
    }
}
