package BaiTap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Enter size of array: ");
        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) +": ");
            array[i] = input.nextInt();
        }
        System.out.print("Array: ");
        for (int k : array){
            System.out.print(k + "\t");
        }
        System.out.println();
        int x;
        System.out.print("Enter finding element: ");
        x = input.nextInt();
        for (int i = 0; i < array.length; i++){
            if (array[i] == x) {
                System.out.println("Found element " + x + " in index " + i);
                for (int index_del = i; index_del < array.length - 1; index_del++) {
                    array[index_del] = array[index_del+1];
                }
                array[array.length-1] = 0;
            }
        }
        System.out.print("Array after delete: ");
        for (int k : array){
            System.out.print(k + "\t");
        }
    }
}
