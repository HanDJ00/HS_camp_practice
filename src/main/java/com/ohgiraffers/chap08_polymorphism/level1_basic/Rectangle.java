package com.ohgiraffers.chap08_polymorphism.level1_basic;

public class Rectangle extends Shape implements Resizable{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }
}
