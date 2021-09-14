package Week1.ArrayInJava;

import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        int array[] = new int[10];
        array[0] = 5;
        array[1] = 2;
        array[2] = 4;
        array[3] = 7;
        array[4] = 8;
        array[5] = 1;

        System.out.print("Array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number you want to add: ");
        int number = scanner.nextInt();
        int index = -1;
        do {
            System.out.print("\nEnter the position you want to add: ");
            index = scanner.nextInt();
            if (!checkItem(index, array)) {
                System.out.print("\nThe position is out of array!");
            } else {
                System.out.print("\nNew Array: " + addItem(number, index, array));
            }
        } while (!checkItem(index, array));
    }

    public static Boolean checkItem(int x, int[] array) {
        if (x < 0 || x > (array.length - 1)) {
            return false;
        }
        return true;
    }

    public static String addItem(int number, int index, int[] array) {
        String str = "";
        int[] array2 = new int[10];
        array2[index] = number;

        for (int i = 0; i < index; i++) {
            array2[i] = array[i];
        }

        for (int j = index + 1; j < array2.length; j++) {
            array2[j] = array[j - 1];
        }

        for (int k = 0; k < array2.length; k++) {
            str += array2[k] + " ";
        }
        return str;
    }
}
