package Demo;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("src/Demo/temp.dat"))) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        } catch (IOException exception) {
            System.out.println("File not found or error!");
        } try (DataInputStream input = new DataInputStream(new FileInputStream("src/Demo/temp.dat"))) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        } catch (IOException exception) {
            System.out.println("File not found or error!");
        }
    }
}
