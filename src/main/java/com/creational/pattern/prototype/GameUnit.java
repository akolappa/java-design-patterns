package com.creational.pattern.prototype;

import javax.naming.OperationNotSupportedException;
import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable{

    private Point2D position;

    public GameUnit(){
        this.position = new Point2D.Double();
    }

    public void move (int x, int y){
        position.setLocation(x,y);
    }

    public Point2D getPosition(){
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone();
        initialize();
        reset();
        return gameUnit;
    }

    private void initialize(){
        position.setLocation(0,0);
    }

    protected abstract void reset();
}
