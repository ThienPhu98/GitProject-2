package Week3.Framework.Pack7and9;

import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(35);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(18);
        tree.insert(21);
        tree.insert(20);
        tree.insert(42);
        tree.insert(31);
        tree.insert(50);
        tree.insert(45);
        tree.insert(46);
//        tree.insert(41);
//        tree.insert(40);
//        tree.insert(43);
        tree.insert(32);

        System.out.println("Postorder (sorted): ");
        tree.postOrder();

        boolean checkElement = false;
        int element = 0;
        while (!checkElement){
            System.out.print("\nEnter element you want to remove in Tree: ");
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
            tree.remove(element);
            System.out.println("\nPostorder (sorted) after remove element '" + element + "':");
            tree.postOrder();
        } else {
            System.out.print("\nCan not find element '" + element +  "' in Tree");
        }
    }
    public static boolean isNumeric(String inputString) {
        return inputString.matches("-?\\d+(\\.\\d+)?");
    }
}
