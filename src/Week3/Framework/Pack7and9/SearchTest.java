package Week3.Framework.Pack7and9;

import java.util.Scanner;

public class SearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(10);
        tree.insert(18);
        tree.insert(31);
        tree.insert(42);
        tree.insert(7);
        tree.insert(15);
        tree.insert(21);
        tree.insert(34);
        tree.insert(40);
        tree.insert(45);

        boolean checkElement = false;
        int element = 0;
        while (!checkElement){
            System.out.print("\nEnter element you want to find in Tree: ");
            String inputElement = scanner.nextLine();
            if (isNumeric(inputElement)) {
                try {
                    element = Integer.parseInt(inputElement);
                    checkElement = true;
                } catch (NumberFormatException e) {
                    System.out.print("\nYour Input is Illegal!!! index must be a Integer");
                }
            } else {
                System.out.print("\nYour input is not a number, please try again!");
            }
        }

        if(tree.search(element)) {
            System.out.print("Tree has found element '" + element + "'.");
        } else {
            System.out.print("Can not find element '" + element +  "' in Tree");
        }

    }

    public static boolean isNumeric(String inputString) {
        return inputString.matches("-?\\d+(\\.\\d+)?");
    }
}
