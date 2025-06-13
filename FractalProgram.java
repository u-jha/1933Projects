package CSCI1933P1;

// Written by Urva Jha, jha00031
import java.awt.Color;
import java.util.Scanner;

public class FractalProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What shape do you want to draw a fractal of?"); // asks user for shape of fractal
        String shape = s.nextLine();
        FractalDrawer myFractal = new FractalDrawer();
        double totalArea = myFractal.drawFractal(shape);
        System.out.print(totalArea); // prints total area
    }
}
