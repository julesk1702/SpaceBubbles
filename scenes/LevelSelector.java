package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.SpaceBubbles.BubbleShooter;
import com.github.hanyaeger.SpaceBubbles.buttons.LevelButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

import java.util.ArrayList;

public class LevelSelector extends StaticScene {
    private final BubbleShooter bubbleShooter;
    private final ArrayList<GameScene> gameLevels = new ArrayList<>();

    public LevelSelector(BubbleShooter bubbleShooter){
        this.bubbleShooter = bubbleShooter;
        gameLevels.add(new GameScene(2, "Level 1"));
        gameLevels.add(new GameScene(3, "Level 2"));
        gameLevels.add(new GameScene(4, "Level 3"));
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/spacetheme.mp3");
        setBackgroundImage("backgrounds/levelscreen1.jpg");
    }

    @Override
    public void setupEntities() {
        var xPos = 0;
        for (var level : this.gameLevels) {
            xPos += 150;

            var levelButton = new LevelButton(
                    new Coordinate2D(xPos, 100), bubbleShooter, level);
            addEntity(levelButton);
        }

//        for (int i = 0; i < levels.size(); i++) {
//            level = levels.get(i);
//            levelId++;
//            xPos += 150;
//
//            var levelButton = new LevelButton(
//                    new Coordinate2D(xPos, 100), bubbleShooter, levelId, level
//            );
//        }
    }
}
