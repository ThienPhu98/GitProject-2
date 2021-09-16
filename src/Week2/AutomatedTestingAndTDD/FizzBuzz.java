package Week2.AutomatedTestingAndTDD;

public class FizzBuzz {
    public static String ChangeFizzBuzz(int number) {
        if (checkInputNumber(number)) {
            if (number % 5 == 0 && number % 3 == 0) {
                return "FizzBuzz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (changeNumberToFizzBuzz(number) != "") {
                return changeNumberToFizzBuzz(number);
            } else {
                return readNumber(number);
            }
        } else {
            return "Number Input out of Ability!!!";
        }
    }

    public static boolean checkInputNumber(int number) {
        if (number > 999 || number <0) {
            return false;
        } else {
            return true;
        }
    }

    public static String readUnitOfNumber(int number) {
        String word = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
        return word;
    }

    public static String readDozensOfNumber(int number) {
        String word = "";
        if (number == 10) {
            word = "ten";
        } else if (number > 10 && number <= 19){
            switch (number%10) {
                case 1:
                    word = "eleven";
                    break;
                case 2:
                    word = "twelve";
                    break;
                case 3:
                    word = "thirteen";
                    break;
                case 5:
                    word = "fifteen";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    word = readUnitOfNumber(number%10) + "teen";
                    break;
            }
        } else if (number >= 20){
            int DozensOfNumber = number/10;
            switch (DozensOfNumber) {
                case 2:
                    word = "twenty";
                    break;
                case 3:
                    word = "thirty";
                    break;
                case 5:
                    word = "fifty";
                    break;
                case 8:
                    word = "eighty";
                    break;
                case 4:
                case 6:
                case 7:
                case 9:
                    word = readUnitOfNumber(DozensOfNumber) + "ty";
                    break;
            }
        }
        return word;
    }
    public static String readHundredOfNumber(int number) {
        String word = "";
        if (number >= 1 && number<10) {
            word = readUnitOfNumber(number) + " Hundred";
        }
        return word;
    }

    public static String readNumber(int number) {
        int Hundreds = number / 100;
        int Dozens = number % 100;
        int Units = number % 10;
        String word = "";

        if (readHundredOfNumber(Hundreds) != "") {
            if (Dozens >= 20) {
                word = readHundredOfNumber(Hundreds) + " And " + readDozensOfNumber(Dozens) + " " + readUnitOfNumber(Units);
            } else if (Dozens >= 10){
                word = readHundredOfNumber(Hundreds) + " And " + readDozensOfNumber(Dozens);
            } else if (Dozens > 0){
                word = readHundredOfNumber(Hundreds) + " And " + readUnitOfNumber(Units);
            } else {
                word = readHundredOfNumber(Hundreds);
            }
        } else {
            if (Dozens >= 20) {
                word = readDozensOfNumber(Dozens) + " " + readUnitOfNumber(Units);
            } else if (Dozens >= 10){
                word = readDozensOfNumber(Dozens);
            } else if (Dozens == 0){
                word = "Zero";
            } else{
                word = readUnitOfNumber(Units);
            }
        }
        return word;
    }

    public static String changeNumberToFizzBuzz(int number) {
        String word = "";
        String numberString = String.valueOf(number);
        if (numberString.length() == 3) {
            if (numberString.charAt(0) == '3') {
                if (numberString.charAt(1) == '5' || numberString.charAt(2) == '5'){
                    word = "FizzBuzz";
                } else {
                    word = "Fizz";
                }
            } else if (numberString.charAt(0) == '5') {
                if (numberString.charAt(1) == '3' || numberString.charAt(2) == '3'){
                    word = "FizzBuzz";
                } else {
                    word = "Buzz";
                }
            } else {
                if (numberString.charAt(1) == '3') {
                    if (numberString.charAt(2) == '5') {
                        word = "FizzBuzz";
                    } else {
                        word = "Fizz";
                    }
                } else if (numberString.charAt(1) == '5') {
                    if (numberString.charAt(2) == '3') {
                        word = "FizzBuzz";
                    } else {
                        word = "Buzz";
                    }
                } else {
                    if (numberString.charAt(2) == '3') {
                        word = "Fizz";
                    } else if (numberString.charAt(2) == '5') {
                        word = "Buzz";
                    }
                }
            }
        } else {
            if (numberString.charAt(0) == '3') {
                if (numberString.charAt(1) == '5'){
                    word = "FizzBuzz";
                } else {
                    word = "Fizz";
                }
            } else if (numberString.charAt(0) == '5') {
                if (numberString.charAt(1) == '3') {
                    word = "FizzBuzz";
                } else {
                    word = "Buzz";
                }
            } else {
                if (numberString.charAt(1) == '3') {
                    word = "Fizz";
                } else if (numberString.charAt(1) == '5') {
                    word = "Buzz";
                }
            }
        }

        return word;
    }
}
