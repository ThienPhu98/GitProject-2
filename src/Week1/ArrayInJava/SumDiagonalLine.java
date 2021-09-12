package Week1.ArrayInJava;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int size;
        int [][] square;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the length for the side of the square: ");
            size = scanner.nextInt();
            if (size > 5 || size < 1) {
                System.out.println("Size can not accept!!!");
            }
        } while (size > 5 || size < 1);

        square = new int[size][size];

        for (int i = 0; i < square.length; i++){
            int j = 0;
            String str = "";
            while (j < square[i].length) {
                System.out.print("Enter element " + (j + 1) + " for Array '" + (i + 1) + "' : ");
                square[i][j] = scanner.nextInt();
                str += square[i][j] + " ";
                j++;
            }
            System.out.println("Value of Array '"+ (i + 1) +"' is : " + str);
        }

        int sum =0;

        for (int k = 0; k < square.length; k++){
            sum += square[k][k];
        }
        System.out.println("The total value of diagonal line of Square is: " + sum);
    }
}
