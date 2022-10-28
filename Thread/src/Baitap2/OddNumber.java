package Baitap2;

public class OddNumber extends Thread {
    public void run() {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Something wrong!");
                }
            }
        System.out.println("Odd number ended!");
    }
}
