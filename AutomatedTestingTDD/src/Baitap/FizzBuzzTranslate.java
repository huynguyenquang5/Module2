package Baitap;

public class FizzBuzzTranslate {
    public static String translate(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isSmallerThan0 = number < 0;


        if (isSmallerThan0)
            return "Invalid";

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }

    public static String translateAdvance(int number) {

        int numberUnit = number % 10;
        int numberTens = number / 10;

        if(numberUnit == 3 || numberTens == 3)
            return "Fizz";

        if(numberUnit == 5 || numberTens == 5)
            return "Buzz";

        return number + "";
    }

    public static String translateToString(int number) {
        int numberUnit = number % 10;
        int numberTens = number / 10;
        String unit;
        String tens;
        switch (numberUnit) {
            case 1: unit = "Mot"; break;
            case 2: unit = "Hai"; break;
            case 3: unit = "Ba"; break;
            case 4: unit = "Bon"; break;
            case 5: unit = "Nam"; break;
            case 6: unit = "Sau"; break;
            case 7: unit = "Bay"; break;
            case 8: unit = "Tam"; break;
            case 9: unit = "Chin"; break;
            default: unit = "Khong"; break;
        }

        switch (numberTens) {
            case 1: tens = "Mot"; break;
            case 2: tens = "Hai"; break;
            case 3: tens = "Ba"; break;
            case 4: tens = "Bon"; break;
            case 5: tens = "Nam"; break;
            case 6: tens = "Sau"; break;
            case 7: tens = "Bay"; break;
            case 8: tens = "Tam"; break;
            case 9: tens = "Chin"; break;
            default: tens = "Khong"; break;
        }
        return tens + " " + unit;
    }
}
