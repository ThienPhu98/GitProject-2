package com.ATM;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Processing {

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        Scanner input = new Scanner(System.in);

        Account customer = new Account();
        String choice = "";
        System.out.print("Vietcombank Welcome " + customer.getName());
        System.out.print("\nFollow the Menu to using our service");

        int result5 = choice.compareToIgnoreCase("X");

        do {
            System.out.print("\nMenu:");
            System.out.print("\n1. Enter character A to show your account balance");
            System.out.print("\n2. Enter character D to deposit");
            System.out.print("\n3. Enter character W to withdraw");
            System.out.print("\n4. Enter character H to show your recent transactions");
            System.out.print("\n5. Enter character X to end process");
            System.out.print("\n==========================================================================");
            System.out.print("\nEnter your choice: ");
            choice = input.nextLine();

            int result1 = choice.compareToIgnoreCase("A");
            int result2 = choice.compareToIgnoreCase("D");
            int result3 = choice.compareToIgnoreCase("W");
            int result4 = choice.compareToIgnoreCase("H");
            result5 = choice.compareToIgnoreCase("X");

            if (result1 != 0 && result2 != 0 && result3 != 0 && result4 != 0 && result5 != 0) {
                System.out.print("\nYour Input is out option, please try again!");
                System.out.print("\n==========================================================================");
            } else if (result1 == 0) {
                System.out.print("\nYour account balance is: " + formatter.format(customer.getMoney()) + "vnd");
                System.out.print("\nFollow the Menu to keep using our service");
                System.out.print("\n==========================================================================");
            } else if (result2 == 0) {
                int check = 0;
                String str = "";
                do {
                    System.out.print("\nEnter Amount of money you want to make deposit (less than 100 million): ");
                    str = input.nextLine();
                    if (str.length() <= 9) {
                        Pattern pattern = Pattern.compile("\\d*");
                        Matcher matcher = pattern.matcher(str);
                        if (matcher.matches()) {
                            double money = Double.parseDouble(str);
                            customer.depositMoney(money);
                            String history = "deposit " + formatter.format(money);
                            customer.setHistory(history);
                            check = 1;
                        } else {
                            System.out.print("\nYour input is not a number, Please try again!");
                        }
                    } else {
                        System.out.print("\nYour amount money is more than 100 million, Please try again!");
                    }
                } while(check != 1);
                System.out.print("\nDeposit is successful! Follow the Menu to keep using our service");
                System.out.print("\n==========================================================================");
            } else if (result3 == 0) {
                int check = 0;
                String str = "";
                do {
                    System.out.print("\nEnter Amount of money you want to withdraw (less than 100 million): ");
                    str = input.nextLine();
                    if (str.length() <= 9) {
                        Pattern pattern = Pattern.compile("\\d*");
                        Matcher matcher = pattern.matcher(str);
                        if (matcher.matches()) {
                            double money = Double.parseDouble(str);
                            if (money <= customer.getMoney()){
                                customer.withdrawalMoney(money);
                                String history = "withdraw " + formatter.format(money);
                                customer.setHistory(history);
                                check = 1;
                            } else {
                                System.out.print("\nYour input more than your account balance, Please try again!");
                                System.out.print("\n==========================================================================");
                            }
                        } else {
                            System.out.print("\nYour input is not a number, Please try again!");
                            System.out.print("\n==========================================================================");
                        }
                    } else {
                        System.out.print("\nYour amount money is more than 100 million, Please try again!");
                        System.out.print("\n==========================================================================");
                    }
                } while(check != 1);
                System.out.print("\nWithdraw is successful! Follow the Menu to keep using our service");
                System.out.print("\n==========================================================================");
            } else if (result4 == 0) {
                System.out.print("\nYour recent transactions:");
                customer.getHistory();
                System.out.print("\nFollow the Menu to keep using our service");
                System.out.print("\n==========================================================================");
            } else {
                System.out.print("\nThank you and see you again!");
                System.exit(0);
            }
        } while (result5 != 0);
    }
}
