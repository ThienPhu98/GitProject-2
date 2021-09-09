package Week1.LoopInJava;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1){
                for (int i = 0; i < 3 ; i++){
                    for (int j=0; j < 6; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 2){
                for (int i = 5; i > 0 ; i--){
                    for (int j= 0; j < 6 - i; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 3){
                for (int i = 0; i < 6 ; i++){
                    for (int j= 0; j < 6 - i; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 0) {
                System.exit(0);
            } else {
                System.out.print("Out of Option!");
            }
        }
    }
}
