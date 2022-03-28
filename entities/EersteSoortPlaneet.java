package com.github.hanyaeger.SpaceBubbles.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class EersteSoortPlaneet extends Planeet {
    public EersteSoortPlaneet(final Coordinate2D location){
        super("sprites/ball-pink.png", location, new Size(50, 60));
    }
}
