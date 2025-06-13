package CSCI1933P1;

// Written by Urva Jha, jha00031
import java.awt.Color;

public class Rectangle {
    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Color shapeColor;

    // default constructor
    public Rectangle() {
        xPosition = 0.0;
        yPosition = 0.0;
        width = 0.0;
        height = 0.0;
        shapeColor = Color.BLACK;
    }

    // constructor
    public Rectangle(double x, double y, double w, double h) {
        xPosition = x;
        yPosition = y;
        width = w;
        height = h;
        shapeColor = Color.BLACK; // Initializing color to be used later, but this is not a parameter.
    }

    // accessor and modifier methods
    public void setPos(double x, double y) {
        xPosition = x;
        yPosition = y;
    }

    public double getXPos() {
        return xPosition;
    }

    public double getYPos() {
        return yPosition;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setColor(Color shapeColorInput) {
        shapeColor = shapeColorInput;
    }

    public Color getColor() {
        return shapeColor;
    }

    // calculating information
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public double calculateArea() {
        return width * height;
    }
}
