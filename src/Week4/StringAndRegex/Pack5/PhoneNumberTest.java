package Week4.StringAndRegex.Pack5;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.print("PHONE NUMBER CHECK: ");
        Scanner scanner = new Scanner(System.in);
        boolean checkNumber = false;
        while (!checkNumber) {
            System.out.print("\nEnter number for telephone: ");
            String number = scanner.nextLine();
            if(phoneNumber.validate(number)) {
                System.out.print("\nPhone number is valid: " + number);
                checkNumber = true;
            } else {
                System.out.print("\nPhone number is invalid - number must be follow this: (xx)-(0xxxxxxxxx)");
            }
        }
    }
}
