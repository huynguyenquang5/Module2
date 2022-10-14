package BaiTap1_2;

public class Circle extends Shape implements Resizeable, Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius() + ". The area is: " + getArea();
    }

    @Override
    public void resize(double percent) {
        System.out.println( "Resized: " + percent + " %");
    }

    @Override
    public String howToColor() {
        return "Circle color all four sides";
    }
}
