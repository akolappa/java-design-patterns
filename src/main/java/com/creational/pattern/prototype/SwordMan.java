package com.creational.pattern.prototype;

import java.awt.geom.Point2D;

public class SwordMan extends GameUnit{

    private String mode = "idle";

    public void attack(){
        this.mode = "attack";
    }

    @Override
    protected void reset() {
        this.mode = "idle";
    }
}
