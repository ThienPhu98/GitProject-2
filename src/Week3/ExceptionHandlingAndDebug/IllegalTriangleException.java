package Week3.ExceptionHandlingAndDebug;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first side of Triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("\nEnter second side of Triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("\nEnter third side of Triangle: ");
        double side3 = scanner.nextDouble();

        if (side1 < 0 || side2 < 0 || side3 < 0 || (side1 + side2) < side3 || (side1 + side3) < side2 || (side3 + side2) < side1) {
            throw new IllegalTriangleException();
        } else {
            System.out.print("\nYour Triangle with 3 side {" + side1 + ", " + side2 +", " + ", " + side3 + "}");
        }
    }
}
