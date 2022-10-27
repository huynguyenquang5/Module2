package ThucHanh2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentFile students = new StudentFile();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        students.writeToFile("src/ThucHanh2/student.txt");
        List<Student> studentDataFromFile = students.readDataFromFile("src/ThucHanh2/student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}