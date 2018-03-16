package com.runoob.abstractfactory;

import org.springframework.lang.NonNull;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        switch (color.toUpperCase()) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
