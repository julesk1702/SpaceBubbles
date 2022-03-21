package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;

public class GameScene extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/levelmusic.mp3");
        setBackgroundImage("backgrounds/space.jpg");
    }

    @Override
    public void setupEntities() {

    }
}
