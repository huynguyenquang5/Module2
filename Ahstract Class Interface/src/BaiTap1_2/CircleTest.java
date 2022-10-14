package BaiTap1_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        Resizeable resizeable = new Circle();
        resizeable.resize(Math.random() * 99);
    }
}
