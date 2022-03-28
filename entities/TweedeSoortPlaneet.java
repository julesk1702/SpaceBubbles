package com.github.hanyaeger.SpaceBubbles.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class TweedeSoortPlaneet extends Planeet {
    public TweedeSoortPlaneet(final Coordinate2D location){
        super("sprites/hanny.png", location, new Size(50, 60));
    }
}
