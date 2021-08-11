package com.creational.pattern.prototype;

import javax.naming.OperationNotSupportedException;

public class General extends GameUnit{

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Generals are not needed to be resetted");
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General is not clonable");
    }
}
