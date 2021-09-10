package Week1.LoopInJava;

import java.util.Scanner;

public class ShowPrimeNumber {

    public static boolean Check(int number){
        if (number < 2){
            return false;
        } else if (number == 2){
            return true;
        } else {
            for (int index = 2 ; index < number; index++){
                if (number % index == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount of Prime number out print: ");
        int amount = scanner.nextInt();
        int count = 1;

        for (int N = 2; count <= amount; N++){
            if (Check(N)) {
                System.out.print(N + "  ");
                count++;
            }
        }
    }

}
