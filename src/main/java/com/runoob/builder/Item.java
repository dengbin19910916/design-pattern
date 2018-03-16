package com.runoob.builder;

/**
 * 食物条目。
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
