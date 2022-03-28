package com.github.hanyaeger.SpaceBubbles.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Planeet extends DynamicSpriteEntity {
    protected Planeet(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }
}
