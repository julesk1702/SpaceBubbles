package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.SpaceBubbles.entities.EersteSoortPlaneet;
import com.github.hanyaeger.SpaceBubbles.entities.Planeet;
import com.github.hanyaeger.SpaceBubbles.entities.TweedeSoortPlaneet;
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

    private Planeet getPlaneet(int xPos, int i) {
        int type = ThreadLocalRandom.current().nextInt(0, 2);
        switch (type) {
            case 0:
                return new EersteSoortPlaneet(
                        new Coordinate2D(xPos + i * 30, 50)
                );

            case 1:
                return new TweedeSoortPlaneet(
                        new Coordinate2D(xPos + i * 30, 50)
                );
            default:
                return new EersteSoortPlaneet(
                        new Coordinate2D(xPos + i * 30, 50)
                );
        }
    }
}
