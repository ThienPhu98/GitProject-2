package Week3.AlgorithmSearch;

import java.util.Scanner;

public class BinarySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("System Binary Find a Number in Array:");
        int Size = 0;
        boolean checkSize = false;
        while (!checkSize){
            System.out.print("\nEnter size for Array(>0 & <10): ");
            String inputSize = scanner.nextLine();
            if (isNumeric(inputSize)) {
                try {
                    Size = Integer.parseInt(inputSize);
                    if (Size > -1 && Size < 10) {
                        checkSize = true;
                    } else {
                        System.out.print("\nYour Input is Illegal!!! Size must be more than '-1' and less than 10");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("\nYour Input is Illegal!!! Size must be a Integer");
                }
            } else {
                System.out.print("\nYour input is not a number, please try again!");
            }
        }

        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            boolean checkNumber = false;
            while (!checkNumber) {
                System.out.print("\nEnter element " + (i + 1) + " for Array: ");
                String inputNumber = scanner.nextLine();
                if (isNumeric(inputNumber)) {
                    try {
                        int number = Integer.parseInt(inputNumber);
                        Array[i] = number;
                        checkNumber = true;
                    } catch (NumberFormatException e) {
                        System.out.print("\nYour Input is Illegal!!! Size must be a Integer");
                    }
                } else {
                    System.out.print("\nYour input is not a number, please try again!");
                }
            }
        }

        System.out.print("\nYour Array: " + showArray(Array));

        if (Array.length != 0) {
            sortArrayInteger(Array);
            System.out.print("\nYour Array after sort: " + showArray(Array));

            System.out.print("\nEnter a number you want to find in Array: ");
            int number = scanner.nextInt();
            int position = binarySearch(Array, 0, Array.length - 1 , number);

            if (position == -1 ){
                System.out.print("\nYour number is out of Array!");
            } else {
                System.out.print("\nYour number at position '" + (position+1) + "' in the Array");
            }
        }
    }

    public static boolean isNumeric(String inputString) {
        return inputString.matches("-?\\d+(\\.\\d+)?");
    }

    public static void sortArrayInteger(int[] array) {
        int temp = array[0];
        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static String showArray(int[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += array[i] + " ";
        }
        if (string == "") {
            string = "Null";
        }
        return string;
    }

    public static int binarySearch(int[] array, int left, int right ,int value) {
        int position = -1;
        int middle = (left + right) / 2;
        while (left > right) {
            if (array[middle] == value) {
                position = middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else if (value < array[middle]) {
                right = middle - 1;
            }
        }
        return position;
    }
}
