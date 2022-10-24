package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

class InsertionSortIntList {
    public static void insertionSort(int[] list) {
        int temp, pos;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            while (pos > 0 && temp < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = temp;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}