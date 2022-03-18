package com.github.hanyaeger.bubbleshooter;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class BubbleShooter extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Space Bubbles");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {

    }
}
