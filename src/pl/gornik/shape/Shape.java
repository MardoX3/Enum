package pl.gornik.shape;

import pl.gornik.shape.ColorType;

public class Shape {
    private String name;
    private char size;
    private ColorType color;

    public String getName() {
        return name;
    }

    public char getSize() {
        return size;
    }

    public ColorType getColor() {
        return color;
    }

    public Shape(String name, char size, ColorType color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name '" + name +
                ", size " + size +
                ", color " + color.getColor();
    }
}
