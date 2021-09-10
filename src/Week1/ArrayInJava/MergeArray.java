package Week1.ArrayInJava;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size for array1 (<10):");
            size1 = scanner.nextInt();
            if (size1 > 10)
                System.out.println("Size does not exceed 10");
        } while (size1 > 10);
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }

        int size2;
        int[] array2;
        do {
            System.out.print("Enter a size for array2 (<10):");
            size2 = scanner.nextInt();
            if (size2 > 10)
                System.out.println("Size does not exceed 10");
        } while (size2 > 10);
        array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }

        System.out.print("MergeArray: " + Merge(array1, array2));
    }
    public static String Merge(int[] arr1, int[] arr2){
        String str = "";
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int k = 0; k < arr1.length; k++){
            arr3[k] = arr1[k];
        }
        int l = 0;
        for (int h = arr1.length; h < arr3.length; h++){
            arr3[h] = arr2[l];
            l++;
        }
        for (int n = 0; n < arr3.length; n++){
            str += arr3[n] + " ";
        }
        return str;
    }
}
