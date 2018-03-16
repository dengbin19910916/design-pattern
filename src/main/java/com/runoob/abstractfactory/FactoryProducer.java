package com.runoob.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        switch (choice.toUpperCase()) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                return null;
        }
    }
}
