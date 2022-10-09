package BaiTap;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int size1;
        int[] array1;
        System.out.print("Enter size of array 1: ");
        size1 = input1.nextInt();
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) +": ");
            array1[i] = input1.nextInt();
        }
        int size2;
        int[] array2;
        System.out.print("Enter size of array 2: ");
        size2 = input1.nextInt();
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) +": ");
            array2[i] = input1.nextInt();
        }
        System.out.print("Array 1: ");
        for (int k : array1){
            System.out.print(k + "\t");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int k : array2){
            System.out.print(k + "\t");
        }
        int[] array3 = new int[size1 + size2];
//        for (int i = 0; i < array1.length; i++){
//            array3[i] = array1[i];
//        }
        System.arraycopy(array1, 0, array3, 0, array1.length);
        int index2 = 1;
        for (int i = array3.length - 1; i >= array2.length; i--){
            array3[i] = array2[array2.length - index2];
            index2++;
        }
        System.out.println();
        System.out.print("Array 3: ");
        for (int k : array3){
            System.out.print(k + "\t");
        }
    }
}
