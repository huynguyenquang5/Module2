package BaiTap;

import java.util.Scanner;

public class FindMinButNoFunction {
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
            System.out.print(k + " ");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Min = " + min);
    }
}
