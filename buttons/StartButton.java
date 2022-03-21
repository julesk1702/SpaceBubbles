package com.github.hanyaeger.SpaceBubbles.buttons;

import com.github.hanyaeger.SpaceBubbles.BubbleShooter;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private BubbleShooter bubbleShooter;

    public StartButton(Coordinate2D initialLocation, BubbleShooter bubbleShooter) {
        super(initialLocation, "PLAY");
        setFill(Color.WHITE);
        setFont(Font.font("Bebas Neue", FontWeight.BOLD, 30));
        setAnchorPoint(AnchorPoint.CENTER_CENTER);

        this.bubbleShooter = bubbleShooter;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        bubbleShooter.setActiveScene(1);
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
