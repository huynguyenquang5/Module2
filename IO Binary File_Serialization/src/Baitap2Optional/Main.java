package Baitap2Optional;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Baitap1/product.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/Baitap2Optional/ProductCopy"));
            byte read;
            while ((read = (byte)objectInputStream.read()) != -1) {
                objectOutputStream.write(read);
            }
            objectOutputStream.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
