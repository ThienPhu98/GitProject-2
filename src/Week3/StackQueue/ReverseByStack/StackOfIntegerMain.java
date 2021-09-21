package Week3.StackQueue.ReverseByStack;
import java.util.Scanner;

class StackOfIntegerMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int [] array;
        int size = -1;
        do {
            System.out.print("\nEnter size for Array: ");
            size = scanner.nextInt();
            if (size < 0) {
                System.out.print("\nSize is not suitable, please try again: ");
            }
        } while (size < 0);
        array = new int[size];

        for (int index = 0; index < size; index++) {
            double number = ((Math.random()*100) + 1);
            int numberInt = (int) number;
            array[index] = numberInt;
        }

        if (size == 0) {
            System.out.print("\nArray is empty");
        } else {
            System.out.print("\nArray after push random element:" + showElementOfArray(array));
            reverse(array);
            System.out.print("\nArray after Reverse: " + showElementOfArray(array));
        }
    }

    public static void reverse(int[] array) {
        StackOfInteger stackOfInteger = new StackOfInteger(array.length);

        for (int j = 0; j < array.length; j++) {
            stackOfInteger.push(array[j]);
        }

        for (int k = 0; k < array.length; k++) {
            array[k] = stackOfInteger.pop();
        }
    }

    public static String showElementOfArray(int[] array) {
        String elements = "";
        for (int i = 0; i < array.length; i++) {
            elements += array[i] + " ";
        }
        return elements;
    }
}
