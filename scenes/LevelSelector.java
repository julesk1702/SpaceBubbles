package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.SpaceBubbles.BubbleShooter;
import com.github.hanyaeger.SpaceBubbles.buttons.LevelButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

import java.util.ArrayList;

public class LevelSelector extends StaticScene {
    private BubbleShooter bubbleShooter;

    public LevelSelector(BubbleShooter bubbleShooter){
        this.bubbleShooter = bubbleShooter;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/spacetheme.mp3");
        setBackgroundImage("backgrounds/levelscreen1.jpg");
    }

    @Override
    public void setupEntities() {
        var level1Button = new LevelButton(
                new Coordinate2D(100, 100), bubbleShooter, 2, "Level 1"
        );
        var level2Button = new LevelButton(
                new Coordinate2D(300, 100), bubbleShooter, 3, "Level 2"
        );
        var level3Button = new LevelButton(
                new Coordinate2D(500, 100), bubbleShooter, 3, "Level 3"
        );
        addEntity(level1Button);
        addEntity(level2Button);
        addEntity(level3Button);
    }
}
