package BaiTap;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(12,"Blue");
        Cylinder cylinder = new Cylinder(10,"Yellow", 15);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println(cylinder);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}

class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * this.getRadius() * this.getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", height=" + getHeight() +
                ", color=" + getColor() +
                '}';
    }
}