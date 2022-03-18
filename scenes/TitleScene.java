package com.github.hanyaeger.bubbleshooter.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;

public class TitleScene extends StaticScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/birdstheme.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {

    }
}
