package Baitap1;

public class NumberGenerator2 implements Runnable {

    @Override
    synchronized public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            System.out.println(hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Something wrong!!");
            }
        }
        System.out.println("Class ended!");
    }
}