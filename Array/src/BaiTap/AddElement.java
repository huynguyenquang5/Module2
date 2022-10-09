package BaiTap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Enter size of array: ");
        size = input1.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) +": ");
            array[i] = input1.nextInt();
        }
        System.out.print("Array: ");
        for (int k : array){
            System.out.print(k + "\t");
        }
        System.out.println();
        int x;
        System.out.print("Enter element want to add: ");
        x = input1.nextInt();
        int index;
        System.out.print("Enter index want to add: ");
        index = input1.nextInt();
        for (int i = array.length - 1; i > index; i--){
          array[i] = array[i-1];
        }
        array[index] = x;
        System.out.print("Array after add: ");
        for (int k : array){
            System.out.print(k + "\t");
        }
    }
}
