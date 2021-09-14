package Week1.ArrayInJava;

import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int array[] = new int[10];
        array[0] = 5;
        array[1] = 2;
        array[2] = 4;
        array[3] = 7;
        array[4] = 8;
        array[5] = 1;

        int number = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array is: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        do {
            System.out.print("\nEnter a number you want to delete in Array: ");
            number = scanner.nextInt();
            if (!checkNumber(number, array)){
                System.out.print("\nThe number input isn't in Array!");
            } else {
                System.out.print("\nValue of Array: " + deleteNumber(number, array));
            }
        } while (!checkNumber(number, array));
    }
    public static boolean checkNumber(int x, int[]array){
        for (int i = 0; i < array.length; i++){
            if (x == array[i]){
                return true;
            }
        }
        return false;
    }
    public static String deleteNumber(int x, int[]array){
        String str = " ";
        for (int i = 0; i < array.length; i++){
            if (x == array[i]){
                for (int j = i + 1; j < array.length; j++){
                    array[i] = array[j];
                    i++;
                }
            }
        }
        for (int k = 0; k < array.length; k++){
            str += array[k] + " ";
        }
        return str;
    }
}
