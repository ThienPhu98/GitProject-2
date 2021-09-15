package Week2.CleanCodeAndRefactoring.Pack1;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.print("Calculator:");
        System.out.print("\nEnter number 1: ");
        number1 = scanner.nextInt();
        System.out.print("\nEnter number 2: ");
        number2 = scanner.nextInt();
        System.out.print("\nEnter calculation: ");
        String calculation = scanner.next();
        char operator = calculation.charAt(0);

        System.out.print("\nThe Result is: " + Calculator.calculate(number1, number2, operator));

    }



}
