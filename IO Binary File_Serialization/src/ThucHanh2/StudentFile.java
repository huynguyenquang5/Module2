package ThucHanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFile {
    private List<Student> students;

    public StudentFile() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public void writeToFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readDataFromFile(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
}
