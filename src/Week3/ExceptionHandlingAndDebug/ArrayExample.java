package Week3.ExceptionHandlingAndDebug;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of Array: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an Index to print out of element (0-99): ");
        int x = scanner.nextInt();
        try {
            System.out.println("Element of Index '" + x + "' is: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Your input out of array length!!!");
        }
    }
}
