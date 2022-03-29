package com.github.hanyaeger.SpaceBubbles.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class soortPlaneet extends Planeet {
    public soortPlaneet(final Coordinate2D location, String image){
        super(image, location, new Size(50, 60));
    }
}
