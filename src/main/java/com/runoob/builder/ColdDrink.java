package com.runoob.builder;

/**
 * 冷饮。
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
