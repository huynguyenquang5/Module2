package BaiTap;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("" + student1.getName());
        System.out.println("" + student1.getClasses());
        student1.setName("Marry");
        student1.setClasses("C03");
        System.out.println("" + student1.getName());
        System.out.println("" + student1.getClasses());
    }
}
class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(){
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
