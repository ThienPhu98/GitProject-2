package Week2.AutomatedTestingAndTDD;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        if (year < 1) {
            return "Year is incorrect!";
        } else {
            if (month < 1 || month > 12) {
                return "Month is incorrect!";
            } else {
                int MaxDay = findMaxDayOfMonth(month, year);
                if (day > MaxDay || day < 1) {
                    return "Day is incorrect!";
                } else if (day == MaxDay){
                    if (month == 12) {
                        return "1/1/"+ (year + 1);
                    } else {
                        return "1/" + (month + 1) +"/" + year;
                    }
                } else {
                    return (day + 1) + "/" + month + "/" + year;
                }
            }
        }
    }

    public static int findMaxDayOfMonth(int month, int year){
        int MaxDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                MaxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                MaxDay = 30;
                break;
            case 2:
                if(findLeapYear(year)) {
                    MaxDay = 29;
                } else {
                    MaxDay = 28;
                }
                break;
        }
        return MaxDay;
    }

    public static boolean findLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
