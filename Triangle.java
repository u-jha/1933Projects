package CSCI1933P1;

// Written by Urva Jha, jha00031
import java.awt.Color;

public class Triangle {
    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Color shapeColor;

    // default constructor
    public Triangle() {
        xPosition = 0;
        yPosition = 0;
        width = 0;
        height = 0;
        shapeColor = Color.BLACK;
    }

    // constructor with four parameters
    public Triangle(double x, double y, double w, double h) {
        xPosition = x;
        yPosition = y;
        width = w;
        height = h;
        shapeColor = Color.BLACK; // initializing color to be used later, but this is not a parameter.
    }

    // calculating information
    public double calculatePerimeter() {
        return width + 2 * Math.sqrt(Math.pow(height, 2) + (Math.pow(width / 2, 2)));
        // formula for perimeter using pythagorean thrm
    }

    public double calculateArea() {
        return height * width / 2.0; // formula for area of a triangle
    }

    // accessor and modifier methods
    public void setColor(Color shapeColorInput) {
        shapeColor = shapeColorInput;
    }

    public void setPos(double x, double y) {
        xPosition = x;
        yPosition = y;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
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

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}