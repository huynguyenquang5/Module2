package Baitap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneValidate {
        private static final String TELEPHONE_REGEX = "^[(]\\d{2}[)]-[(]\\d{10}[)]$";

        public TelephoneValidate() {

        }

        public boolean validate(String regex) {
            Pattern pattern = Pattern.compile(TELEPHONE_REGEX);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
