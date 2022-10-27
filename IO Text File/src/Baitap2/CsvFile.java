package Baitap2;

import java.io.*;

public class CsvFile {
    public static void main(String[] args) {
            readCSVFile("src/Baitap2/text.csv");
    }

    private static void readCSVFile(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] strings = string.split(",");
                System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

}
