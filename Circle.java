package CSCI1933P1;

// Written by Urva Jha, jha00031
import java.awt.Color;

public class Circle {
    private double xPosition;
    private double yPosition;
    private double radius;
    private Color shapeColor;

    // default constructor
    public Circle() {
        xPosition = 0;
        yPosition = 0;
        radius = 0;
        shapeColor = Color.BLACK;
    }

    // constructor with three parameters
    public Circle(double x, double y, double r) {
        this.xPosition = x;
        this.yPosition = y;
        this.radius = r;
        this.shapeColor = Color.BLACK; // initializing color to be used later, but this is not a parameter.
    }

    // methods with calculations
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // formula for perimeter
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2); // formula for area of a circle
    }

    // accessor and modifier methods
    public void setColor(Color shapeColorInput) {
        shapeColor = shapeColorInput;
    }

    public void setPos(double x, double y) {
        xPosition = x;
        yPosition = y;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public Color getColor() {
        return shapeColor;
    }

    public double getXPos() {
        return xPosition;
    }

    public double getYPos() {
        return yPosition;
    }

    public double getRadius() {
        return radius;
    }

}