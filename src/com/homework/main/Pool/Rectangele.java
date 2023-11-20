package com.homework.main.Pool;

public class Rectangele {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangele(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
}
