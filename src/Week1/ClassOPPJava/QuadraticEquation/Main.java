package Week1.ClassOPPJava.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("QuadraticEquation: a(x*x) + bx + c = 0");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("this Quadratic Equation has 2 Root are: " + quadraticEquation.getRoot1() +" and "+ quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("this Quadratic Equation has only 1 Root is: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("this Quadratic Equation has no root!");
        }
    }
}
