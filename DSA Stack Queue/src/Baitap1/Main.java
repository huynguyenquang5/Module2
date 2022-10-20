package Baitap1;

public class Main {
    public static void main(String[] args) {
        MyGenericStack<Integer> iStack = new MyGenericStack<>();
        iStack.push(1);
        iStack.push(2);
        iStack.push(3);
        iStack.push(4);
        iStack.push(5);
        System.out.println(iStack.size());
        iStack.display();
        System.out.println();
        System.out.println("Reverse: ");
        iStack.reverse();
        iStack.display();
        System.out.println();

        MyGenericStack<String> wStack = new MyGenericStack<>();
        String mWord = "Hello";
        String[] mWord1 = mWord.split("");
        for (String s : mWord1) {
            wStack.push(s);
        }
        wStack.display();


    }
}