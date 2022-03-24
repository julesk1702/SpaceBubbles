package com.github.hanyaeger.SpaceBubbles.buttons;

import com.github.hanyaeger.SpaceBubbles.BubbleShooter;
import com.github.hanyaeger.SpaceBubbles.scenes.GameScene;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.YaegerScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private final BubbleShooter bubbleShooter;
    private final int targetSceneIndex;

    public LevelButton(Coordinate2D initialLocation, BubbleShooter bubbleShooter, int targetSceneIndex, String targetSceneName) {
        super(initialLocation, targetSceneName);
        this.targetSceneIndex = targetSceneIndex;
        setFill(Color.WHITE);
        setFont(Font.font("Bebas Neue", FontWeight.BOLD, 30));
        this.bubbleShooter = bubbleShooter;
    }

    public LevelButton(Coordinate2D initialLocation, BubbleShooter bubbleShooter, GameScene targetScene) {
        this(initialLocation, bubbleShooter,targetScene.id, targetScene.name);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        bubbleShooter.setActiveScene(targetSceneIndex);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.GRAY);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }
}
