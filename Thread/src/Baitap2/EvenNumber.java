package Baitap2;

public class EvenNumber extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Something wrong!");
            }
        }
        System.out.println("Even number ended!");
    }
}
