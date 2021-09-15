package Week2.CleanCodeAndRefactoring.Pack2;
import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fizz-Buzz:");
        System.out.print("\nEnter amount 'Fizz-Buzz' you want to output: ");
        int amount = scanner.nextInt();
        System.out.print("\n");
        int count = 0;
        for (int number = 0; count < amount; number++){
            if (FizzBuzz.fizzBuzz(number) == "FizzBuzz") {
                count ++;
            }
            System.out.print(FizzBuzz.fizzBuzz(number)+" ");
        }
    }
}
