package BaiTap1_2;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4.3);
        System.out.println(square);

        Resizeable resizeable = new Square();
        resizeable.resize(Math.random()*99);

        Colorable colorable = new Square();
        System.out.println(colorable.howToColor());
    }
}
