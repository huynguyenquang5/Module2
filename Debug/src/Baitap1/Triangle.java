package Baitap1;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        boolean check1 = side1 + side2 <= side3;
        boolean check2 = side1 + side3 <= side2;
        boolean check3 = side2 + side3 <= side1;
        if (check1 || check2 || check3)
            throw new IllegalTriangleException(side1, side2, side3);
        boolean check4 = side1 < 0 || side2 < 0 || side3 < 0;
        if (check4)
            throw new IllegalTriangleException(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
