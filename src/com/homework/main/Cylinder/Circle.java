package com.homework.main.Cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
       if (radius<0)   {
     radius=0;this.radius = radius;
    }
    else{
    this.radius = radius;}
    }

    public double getRadius() {

        return radius;
    }


        public double getArea() {
            return Math.PI*(Math.pow(this.radius,2));

        }


}


