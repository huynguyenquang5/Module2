package Baitap1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidate {
    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ClassValidate() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
