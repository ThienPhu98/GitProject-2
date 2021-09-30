package Week4.StringAndRegex.Pack4;

import java.util.Scanner;

public class ClassNameTest {
    private static ClassName className;
    public static void main(String[] args) {
        className = new ClassName();
        System.out.print("Name for Class: ");
        Scanner scanner = new Scanner(System.in);
        boolean checkName = false;
        while (!checkName) {
            System.out.print("\nEnter Name for Class: ");
            String name = scanner.nextLine();
            if(className.validate(name)) {
                System.out.print("\nName for Class is valid: " + name);
                checkName = true;
            } else {
                System.out.print("\nName for Class is invalid: name of class should be start with {A, C, P}, without special character and end with {G, H, I, K, L, M}. Please try a gain!");
            }
        }
    }
}
