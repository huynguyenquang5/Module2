package Baitap2;

public class TestThread {
    public static void main(String[] args) {
        System.out.println("Start program: ");
        OddNumber oddNumber = new OddNumber();
        EvenNumber evenNumber = new EvenNumber();
        try {
            oddNumber.start();
            oddNumber.join();
            evenNumber.start();
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }

    }

}
