package BaiTap;

import java.util.Locale;
import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd = 23000;
        System.out.println("Enter dollar: ");
        int dollar = scanner.nextInt();
        double result = vnd * dollar;
        System.out.printf(Locale.US,"Result: %.0f VND ", result);
    }
}
