package Baitap;

import java.util.LinkedList;

public class BinarySearch {
    private final LinkedList<Character> list;

    private final LinkedList<Character> max = new LinkedList<>();

    public BinarySearch() {
        list = new LinkedList<>();
    }

    public void binarySearch(String string) {
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
    }

    public void display() {
        for (Character character: max) {
            System.out.println(character);
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch("Welcome");
        binarySearch.display();
    }
}
