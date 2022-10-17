package Baitap;

public class NextDayCalculator {
    public static int dayTomorrow(int day, int month, int year) {
        boolean isDivisionBy4 = year % 4 == 0;
        boolean isDivisionBy100 = year % 100 == 0;
        boolean isDivisionBy400 = year % 400 == 0;
        boolean day30 = day == 30;
        boolean day29 = day == 29;
        boolean day28 = day == 28;
        boolean day31 = day == 31;
        if (isDivisionBy4) {
            if (isDivisionBy100) {
                if (isDivisionBy400) {
                    switch (month) {
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day30)
                                return 1;
                            break;
                        case 2:
                            if (day29)
                                return 1;
                            break;
                        default:
                            if (day31)
                                return 1;
                            break;
                    }
                } else {
                    switch (month) {
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day30)
                                return 1;
                            break;
                        case 2:
                            if (day28)
                                return 1;
                            break;
                        default:
                            if (day31)
                                return 1;
                            break;
                    }
                }
            } else {
                switch (month) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day30)
                            return 1;
                        break;
                    case 2:
                        if (day29)
                            return 1;
                        break;
                    default:
                        if (day31)
                            return 1;
                        break;
                }
            }
        } else {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day30)
                        return 1;
                    break;
                case 2:
                    if (day28)
                        return 1;
                    break;
                default:
                    if (day31)
                        return 1;
                    break;
            }
        }
        return day + 1;
    }
}
