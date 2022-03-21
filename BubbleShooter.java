package com.github.hanyaeger.SpaceBubbles;

import com.github.hanyaeger.SpaceBubbles.scenes.GameScene;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.SpaceBubbles.scenes.TitleScene;

public class BubbleShooter extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Space Bubbles");
        setSize(new Size(700, 800));
    }

    @Override
    public void setupScenes() {

        addScene(0, new TitleScene(this));
        addScene(1, new GameScene());
    }
}
