package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import javafx.scene.paint.Color;

public class GameScene extends DynamicScene {
    public String name;
    public int id;

    public GameScene() {

    }

    public GameScene(int sceneId, String name) {
        id = sceneId;
        this.name = name;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/levelmusic.mp3");
        setBackgroundImage("backgrounds/space.jpg");
    }

    @Override
    public void setupEntities() {
        var text = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2), "Hallo"
        );
        text.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        text.setFill(Color.WHITE);
        addEntity(text);
    }
}
