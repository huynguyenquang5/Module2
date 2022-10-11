package BaiTap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.0,"blue");
        System.out.println("Circle 1:");
        circle1.displayCircle();
        System.out.println("Circle 2:");
        circle2.displayCircle();
    }
}

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public void displayCircle(){
        System.out.println("Radius: " + getRadius());
        System.out.println("Color: " + getColor());
        System.out.println("Area: " + getArea());
    }
}