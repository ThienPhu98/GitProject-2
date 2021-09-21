package Week3.StackQueue.ReverseByStack;

import java.util.Scanner;

public class StackOfStringMain {
    public static void main(String args[]) {
        System.out.print("Enter a String you want to Reverse: ");
        Scanner scanner = new Scanner(System.in);
        String InputString = scanner.nextLine();
        StringBuffer string = new StringBuffer(InputString);

        reverse(string);
        System.out.print("\nReversed string is: " + string);
    }

    public static void reverse(StringBuffer string) {
        int size = string.length();
        StackOfString stack = new StackOfString(size);

        for (int i = 0; i < size; i++)
            stack.push(string.charAt(i));

        for (int j = 0; j < size; j++) {
            string.setCharAt(j, stack.pop());
        }
    }
}
