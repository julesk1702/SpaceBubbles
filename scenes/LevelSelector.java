package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.SpaceBubbles.BubbleShooter;
import com.github.hanyaeger.SpaceBubbles.buttons.LevelButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

import java.util.ArrayList;

public class LevelSelector extends StaticScene {
    private BubbleShooter bubbleShooter;
    private String level;
    private int levelId;
    private int xPos;

    ArrayList<String> levels = new ArrayList<String>();


    public LevelSelector(BubbleShooter bubbleShooter){
        this.bubbleShooter = bubbleShooter;
        levels.add("Level 1");
        levels.add("Level 2");
        levels.add("Level 3");
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/spacetheme.mp3");
        setBackgroundImage("backgrounds/levelscreen1.jpg");
    }

    @Override
    public void setupEntities() {
        for(int i = 0; i < levels.size(); i++){
            level = levels.get(i);
            levelId++;
            xPos += 150;

            var levelButton = new LevelButton(
                    new Coordinate2D(xPos, 100), bubbleShooter, levelId, level
            );
            addEntity(levelButton);
        }
    }
}
