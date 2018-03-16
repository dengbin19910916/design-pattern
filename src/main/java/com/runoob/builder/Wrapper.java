package com.runoob.builder;

/**
 * 纸盒装。
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
