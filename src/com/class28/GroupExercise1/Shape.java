package com.class28.GroupExercise1;

public interface Shape {

    double calculateArea();

    double calculatePerimiter();
}

class Circle implements Shape {

    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimiter() {
       return 2*3.14*radius ;
    }

}

class Square implements Shape {

    double length;
    double width;
    int sides;

    Square(double l, double w) {
        length = l;
        width = w;
    }

    Square(int s, double l) {
        sides = s;
        length = l;
    }

    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimiter() {
        return sides * length;
    }
}

