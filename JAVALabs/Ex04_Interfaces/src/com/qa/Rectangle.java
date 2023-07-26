package com.qa;

public class Rectangle extends Shape{
    private double height, width;

    public Rectangle(String name, String colour, double x, double y, double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public boolean isSquare(){
        return (width==height);
    }


    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public Point getCentrePoint() {
        double centerX = getX() + width/2;
        double centerY = getY() + height/2;
        return new Point(centerX,centerY);
    }
}
