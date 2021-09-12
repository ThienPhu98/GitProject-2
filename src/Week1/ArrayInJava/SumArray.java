package Week1.ArrayInJava;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int size1, size2;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a size for array of matrix (<5): ");
            size1 = scanner.nextInt();
            if (size1 > 5 || size1 < 0) {
                System.out.println("Size can not accept!!!");
            }
        } while (size1 > 5 || size1 < 0);

        do {
            System.out.print("Enter a value for each array of matrix (<10): ");
            size2 = scanner.nextInt();
            if (size2 > 10 || size2 < 0) {
                System.out.println("Size can not accept!!!");
            }
        } while (size2 > 10 || size2 < 0);

        matrix = new int[size1][size2];

        for (int i = 0; i < matrix.length; i++){
            int j = 0;
            String str = "";
            while (j < matrix[i].length) {
                System.out.print("Enter element " + (j + 1) + " for column '" + (i + 1) + "' : ");
                matrix[i][j] = scanner.nextInt();
                str += matrix[i][j] + " ";
                j++;
            }
            System.out.println("Array '"+ (i + 1) +"' is : " + str);
        }

        int column = -1;
        int sum = 0;

        do {
            System.out.print("Enter a column of matrix you want a total: ");
            column = scanner.nextInt();
            if (column > size1 || column < 1) {
                System.out.println("Out of matrix !!!");
            }
        } while (column > size1 || column < 1);

        for (int i = 0; i < matrix[(column - 1)].length; i++){
            sum += matrix[(column - 1)][i];
        }

        System.out.print("The total value of column '" + column +"' of matrix is: " + sum);
    }
}
