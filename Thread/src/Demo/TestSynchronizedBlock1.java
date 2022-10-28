package Demo;

public class TestSynchronizedBlock1 {
    public static void main(String[] args) {
        Table2 obj = new Table2();// tao object duy nhat

        MyThread3 myThread3 = new MyThread3(obj);
        MyThread4 myThread4 = new MyThread4(obj);

        myThread3.start();
        myThread4.start();
    }
}

class Table2 {
    void printTable(int n) {
        synchronized (this) {// Khoi dong bo (synchronized block)
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }// Ket thuc phuong thuc
}


class MyThread3 extends Thread {
    Table2 t;

    MyThread3(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread4 extends Thread {
    Table2 t;

    MyThread4(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}