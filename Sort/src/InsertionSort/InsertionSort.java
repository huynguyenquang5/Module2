package InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    private final List<Integer> array;

    public InsertionSort() {
        array = new ArrayList<>();
    }

    public void add(int e) {
        array.add(e);
    }
    public void insertionSort(){
        int temp;
        for(int i = 1; i < array.size(); i++){
            temp = array.get(i);
            while(i > 0 && temp < array.get(i - 1)){
                array.set(i, array.get(i - 1));
                i--;
            }
            array.set(i, temp);
        }
    }

    public void display() {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

}

class Main {
    public static void main(String[] args) {
        InsertionSort array = new InsertionSort();
        array.add(5);
        array.add(2);
        array.add(6);
        array.add(0);
        array.add(7666);
        array.add(-1545);
        array.add(3);
        array.add(9);
        array.display();
        array.insertionSort();
        System.out.println();
        array.display();
    }
}