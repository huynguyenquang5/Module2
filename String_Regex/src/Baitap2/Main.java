package Baitap2;

import Baitap1.ClassValidate;

public class Main {
    private static TelephoneValidate telephoneValidate;

    public static final String[] validClass = new String[]
            {"(84)-(0978489648)"};
    public static final String[] invalidClass = new String[]
            {"(a8)-(22222222)"};

    public static void main(String[] args) {
        telephoneValidate = new TelephoneValidate();
        for (String tl : validClass) {
            boolean isValid = telephoneValidate.validate(tl);
            System.out.println("Account is " + tl +" is valid: "+ isValid);
        }
        for (String tl : invalidClass) {
            boolean isValid = telephoneValidate.validate(tl);
            System.out.println("Account is " + tl +" is valid: "+ isValid);
        }
    }
}