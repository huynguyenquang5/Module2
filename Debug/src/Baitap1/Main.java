package Baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle);
        }
        catch (IllegalTriangleException ex) {
            System.err.println("Exception happened: " + ex.getMessage());
        }
    }
}
