package Week1.ArrayInJava;

import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        int size1, size2;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a size for array of matrix (<5):");
            size1 = scanner.nextInt();
            if (size1 > 5) {
                System.out.println("Size does not exceed 5");
            }
        } while (size1 > 5);

        do {
            System.out.print("Enter a value for each array of matrix (<5):");
            size2 = scanner.nextInt();
            if (size2 > 5) {
                System.out.println("Size does not exceed 5");
            }
        } while (size2 > 5);

        matrix = new int[size1][size2];

        for (int i = 0; i < matrix.length; i++){
            int j = 0;
            String str = "";
            while (j < matrix[i].length) {
                System.out.print("Enter element " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
                str += matrix[i][j] + " ";
                j++;
            }
            System.out.println("Array '"+ (i + 1) +"' is : " + str);
        }
        System.out.println("The Max Value of Matrix is: " + FindMax(matrix));
    }
    public static int FindMax(int[][]matrix){
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
