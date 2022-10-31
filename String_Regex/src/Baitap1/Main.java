package Baitap1;

public class Main {
    private static ClassValidate classValidate;

    public static final String[] validClass = new String[]
            {"C0318G", "A1231I"};
    public static final String[] invalidClass = new String[]
            {"M0318G", "P0323A"};

    public static void main(String[] args) {
        classValidate = new ClassValidate();
        for (String cl : validClass) {
            boolean isValid = classValidate.validate(cl);
            System.out.println("Account is " + cl +" is valid: "+ isValid);
        }
        for (String cl : invalidClass) {
            boolean isValid = classValidate.validate(cl);
            System.out.println("Account is " + cl +" is valid: "+ isValid);
        }
    }
}
