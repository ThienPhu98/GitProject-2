package Week5.StructuralDesignPattern.Pack5;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Process Print Integer Number RandomList with only Odd number");
        System.out.print("\nEnter size for the list: ");
        int size = scanner.nextInt();
        System.out.print("\nEnter minimum value for number: ");
        int min = scanner.nextInt();
        System.out.print("\nEnter maximum value for number: ");
        int max = scanner.nextInt();
        System.out.print("\nThe List is: ");

        RandomListFacade List = new RandomListFacade();
        List.printNumber(size, min, max);
    }
}
