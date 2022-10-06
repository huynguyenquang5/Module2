package BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (top-left)");
        System.out.println("3. Print the square triangle (top-right)");
        System.out.println("4. Print the square triangle (bottom-left)");
        System.out.println("5. Print the square triangle (bottom-right)");
        System.out.println("6. Print isosceles triangle");
        System.out.println("7. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        if (choice == 1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
        else if (choice == 2) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
        else if (choice == 3) {
            for (int i = 1; i < 6; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        else if (choice == 4) {
            for (int i = 1; i < 6; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        } else if (choice == 5) {
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
                for (int j = 0; j < 5 - i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        } else if (choice == 6) {
            for (int i = 1; i < 6; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }

        else if (choice == 7) {
            System.exit(0);
        }
        else {
            System.out.println("No choice!");
        }
    }
}
