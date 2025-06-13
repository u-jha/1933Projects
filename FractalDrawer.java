package CSCI1933P1;

// Written by Urva Jha, jha00031
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer {
    private double totalArea; // member variable for tracking the total area
    private Canvas drawing = new Canvas(800, 800); // initializes canvas for use throughout

    public FractalDrawer() {
        totalArea = 0;
    }

    public double drawFractal(String type) {
        if (type.equals("Triangle")) // based on user input
            this.drawTriangleFractal(75, 150, 300, 450, Color.BLACK, 7); // calls triangle method
        else if (type.equals("Circle"))
            this.drawCircleFractal(75, 350, 400, Color.BLACK, 7); // calls circle method
        else if (type.equals("Rectangle"))
            this.drawRectangleFractal(60, 40, 300, 300, Color.BLACK, 7); // calls rectangle method
        return totalArea;
    }

    // TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, int level) {
        if (level >= 1) {
            Triangle myTriangle = new Triangle(x, y, width, height);
            myTriangle.setColor(c);
            // sets color depending on level so that with each recursion it changes colors
            if (level % 3 == 0)
                c = Color.BLUE;
            else if (level % 3 == 1)
                c = Color.RED;
            else
                c = Color.BLACK;
            drawing.drawShape(myTriangle);
            totalArea += myTriangle.calculateArea();
            // the following are the recursion calls
            drawTriangleFractal(width / 2.0, height / 2.0, x - width, y + (height / 2.0), c, level - 1);
            drawTriangleFractal(width / 2.0, height / 2.0, x + 1.5 * width, y + (height / 2.0), c, level - 1);
            drawTriangleFractal(width / 2.0, height / 2.0, x + (width / 4.0), y - (1.5 * height), c, level - 1);
        }
    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, int level) {
        if (level >= 1) {
            Circle myCircle = new Circle(x, y, radius);
            myCircle.setColor(c);
            // sets color depending on level so that with each recursion it changes colors
            if (level % 3 == 0)
                c = Color.BLUE;
            else if (level % 3 == 1)
                c = Color.RED;
            else
                c = Color.BLACK;
            drawing.drawShape(myCircle);
            totalArea += myCircle.calculateArea();
            // the following are the recursion calls
            drawCircleFractal(0.5 * radius, x - 2 * radius, y + 2 * radius, c, level - 1);
            drawCircleFractal(0.5 * radius, x + 2 * radius, y + 2 * radius, c, level - 1);
            drawCircleFractal(0.5 * radius, x - 2 * radius, y - 2 * radius, c, level - 1);
            drawCircleFractal(0.5 * radius, x + 2 * radius, y - 2 * radius, c, level - 1);
        }
    }

    // TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x,
            double y, Color c, int level) {
        if (level >= 1) {
            Rectangle myRectangle = new Rectangle(x, y, width, height);
            myRectangle.setColor(c);
            if (level % 3 == 1)
                c = Color.BLUE;
            else if (level % 3 == 2)
                c = Color.RED;
            else
                c = Color.BLACK;
            drawing.drawShape(myRectangle);
            totalArea += myRectangle.calculateArea();
            // the following are the recursion calls
            drawRectangleFractal(0.5 * width, 0.5 * height, x - width, y + 1.5 * height, c,
                    level - 1);
            drawRectangleFractal(0.5 * width, 0.5 * height, x + 1.5 * width, y + 1.5 * height,
                    c, level - 1);
            drawRectangleFractal(0.5 * width, 0.5 * height, x - width, y - height,
                    c, level - 1);
            drawRectangleFractal(0.5 * width, 0.5 * height, x + 1.5 * width, y - height, c, level - 1);
        }
    }

}