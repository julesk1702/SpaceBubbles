package com.github.hanyaeger.SpaceBubbles.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/spacetheme.mp3");
        setBackgroundImage("backgrounds/space.jpg");
    }

    @Override
    public void setupEntities() {
            var spaceBubbles = new TextEntity(
              new Coordinate2D(getWidth() / 2, getHeight() / 2), "Space Bubbles"
            );
            spaceBubbles.setAnchorPoint(AnchorPoint.CENTER_CENTER);
            spaceBubbles.setFill(Color.WHITE);
            spaceBubbles.setFont(Font.font("Bebas Neue", FontWeight.BOLD, 80));
            addEntity(spaceBubbles);
    }
}
