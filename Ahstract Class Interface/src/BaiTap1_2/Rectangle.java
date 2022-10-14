package BaiTap1_2;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length = "
                + getLength() + ". The area is: " + getArea();
    }

    @Override
    public void resize(double percent) {
        System.out.println( "Resized: " + percent + " %");
    }
}
