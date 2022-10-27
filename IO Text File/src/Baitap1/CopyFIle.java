package Baitap1;

import java.io.*;

public class CopyFIle {
    public static void main(String[] args)  {
        Copy2File("C:\\Users\\huyng\\IdeaProjects\\IO Text File\\src\\Baitap1\\FileOriginal",
                "C:\\Users\\huyng\\IdeaProjects\\IO Text File\\src\\Baitap1\\FileCopy");
    }
    private static void Copy2File(String fileOriginal, String fileCopy) {
        try {
            File file1 = new File(fileOriginal);
            FileReader fileReader = new FileReader(file1);
            File file2 = new File(fileCopy);
            FileWriter fileWriter = new FileWriter(file2);
            int ascii;
            while ((ascii = fileReader.read()) != -1) {
                fileWriter.write(ascii);
            }
            fileWriter.close();
            fileReader.close();
        } catch (IOException ioException) {
            System.err.println("File not found or error");
        }
    }
}
