package BaiTap;

import java.util.Scanner;


public class QuadraticEquationCounting {
    public static class QuadraticEquation{
        double a,b,c;

        public QuadraticEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return (this.b * this.b) - (4 * this.a * this.c);
        }

        public double getRoot1() {
            return ((- this.b + Math.pow(getDiscriminant(),0.5)) / (2 * this.a));
        }

        public double getRoot2() {
            return ((- this.b - Math.pow(getDiscriminant(),0.5)) / (2 * this.a));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation counting = new QuadraticEquation(a,b,c);
        if (counting.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (counting.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + counting.getRoot1());
        } else {
            System.out.println("The equation has two roots " + counting.getRoot1() + " " + counting.getRoot2());
        }
    }

}
