package BaiTap1_2;

public class Square extends Shape implements Resizeable, Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide() + ". The area is: " + getArea();
    }

    @Override
    public void resize(double percent) {
        System.out.println( "Resized: " + percent + " %");
    }

    @Override
    public String howToColor() {
        return "Square color all four sides";
    }
}
