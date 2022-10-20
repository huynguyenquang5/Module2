package Baitap1;

import java.util.ArrayList;

public class MyGenericStack<T> {
    private ArrayList<T> stack;

    public MyGenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public int size() {
        return stack.size();
    }

    public void reverse() {
        ArrayList<T> revStack = new ArrayList<>();
        for (int i = stack.size() - 1; i >= 0; i--) {
            revStack.add(stack.get(i));
        }
        stack = revStack;
    }

    public void display() {
        for (T t : stack) {
            System.out.print(t + " ");
        }
    }

}
