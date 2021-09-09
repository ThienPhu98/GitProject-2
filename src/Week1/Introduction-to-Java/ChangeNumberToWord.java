package com.codegym;

import java.util.Scanner;

public class Main {

    String ReadHundreds, ReadDozens, ReadUnits;

    public static String ReadU (int x) {
        String str = switch (x) {
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
        return str;
    }

    public static String ReadD (int y) {
        String str = "";
        if (y == 10) {
            str = "ten";
        } else if (y > 10 && y <= 19){
            switch (y%10) {
                case 1:
                    str = "eleven";
                    break;
                case 2:
                    str = "twelve";
                    break;
                case 3:
                    str = "thirteen";
                    break;
                case 5:
                    str = "fifteen";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    str = ReadU (y%10) + "teen";
                    break;
            }
        } else if (y >= 20){
            int Y = y/10;
            switch (Y) {
                case 2:
                    str = "twenty";
                    break;
                case 3:
                    str = "thirty";
                    break;
                case 5:
                    str = "fifty";
                    break;
                case 8:
                    str = "eighty";
                    break;
                case 4:
                case 6:
                case 7:
                case 9:
                    str = ReadU(Y) + "ty";
                    break;
            }
        }
        return str;
    }

    public static String ReadH (int z) {
        String str = "";
        if (z >= 1 && z<10) {
            str = ReadU(z) + " Hundred";
        }
        return str;
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    int number;
    System.out.print("Enter your number from 0 to 999: ");
    number = scanner.nextInt();
    String str = "";

    int Hundreds = number / 100;
    int Dozens = number % 100;
    int Units = number % 10;

        if (number > 999 || number < 0) {
            str = "Out of ability!";
        } else if (ReadH (Hundreds) != ""){
            if (Dozens >= 20) {
                str = ReadH (Hundreds) + " And " + ReadD (Dozens) + " " + ReadU (Units);
            } else if (Dozens >= 10){
                str = ReadH (Hundreds) + " And " + ReadD (Dozens);
            } else if (Dozens > 0){
                str = ReadH (Hundreds) + " And " + ReadU (Units);
            } else {
                str = ReadH (Hundreds);
            }
        } else {
            if (Dozens >= 20) {
                str = ReadD (Dozens) + " " + ReadU (Units);
            } else if (Dozens >= 10){
                str = ReadD (Dozens);
            } else if (Dozens == 0){
                str = "Zero";
            } else{
                str = ReadU (Units);
            }
        }
        System.out.println(str);
    }
}
