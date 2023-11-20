package com.homework.main;

public class Cylinder extends Circle{

 private double height;
    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if (height<0)   {
            height=0;this.height = radius;
        }
        else{
            this.height = height;}

    }


    public double getHeight() {
        return height;
    }
    public double getVolume(double height){
    return super.getArea()*getHeight();
    }

}
