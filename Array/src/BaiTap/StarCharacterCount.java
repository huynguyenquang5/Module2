package BaiTap;

import java.io.IOException;
import java.util.Scanner;

public class StarCharacterCount {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter anything: ");
        String string = input.nextLine();
        char find;
        System.out.println("Enter a character: ");
        find = (char) System.in.read();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (find == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Character " + find + " has " + count + " times");
    }
}
