package BaiTap;


import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Triangle");
        System.out.println("Enter 3 sides of triangle and color:");
        System.out.println("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Side 3: ");
        double side3 = scanner.nextDouble();
        System.out.println("Enter color:");
        scanner.nextLine();
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color);
        triangle.isTriangleValid();
        System.out.println(triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());

    }
}

class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    public double getArea() {
        double perimeter = getPerimeter();
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

    public void isTriangleValid() {
        boolean check1 = side1 + side2 > side3;
        boolean check2 = side1 + side3 > side2;
        boolean check3 = side2 + side3 > side1;
        boolean check4 = side1 > 0 && side2 > 0 && side3 > 0;
        if (check1 && check2 && check3 && check4) {
            System.out.println("Triangle Valid");
        } else {
            System.out.println("Triangle Invalid");
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + getColor();
    }
}

class Shape {
    private String color = "Blue";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
