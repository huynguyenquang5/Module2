package Baitap1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator2 numberGenerator2 = new NumberGenerator2();
        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator2);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread1.start();
    }
}
