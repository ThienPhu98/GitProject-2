package Week3.StackQueue.ChangeDecimalToBinary;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Chang Decimal To Binary:");
        System.out.print("\nEnter a Decimal number to change: ");
        int number = scanner.nextInt();
        System.out.print("\nA Binary of number: " + changeDecimalToBinary(number));

    }

    public static StringBuffer changeDecimalToBinary(int Decimal) {
        int result;
        int balance;
        String string = "";

        result = Decimal / 2;
        balance = Decimal % 2;
        if (balance == 0) {
            string += "0";
        } else {
            string += "1";
        }

        while (result != 0) {
            balance = result % 2;
            result = result / 2;
            if (balance == 0) {
                string += "0";
            } else {
                string += "1";
            }
        }

        return changeStringToBinary(string);
    }

    public static StringBuffer changeStringToBinary (String string) {
        StringBuffer Binary = new StringBuffer(string);
        Stack stack = new Stack(Binary.length());

        for (int i = 0; i < Binary.length(); i++)
            stack.push(Binary.charAt(i));

        for (int j = 0; j < Binary.length(); j++) {
            Binary.setCharAt(j, stack.pop());
        }

        return Binary;
    }
}
