package Week3.AlgorithmSort;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            System.out.print("\nLet x = " + array[i] + " with index: " + i);
            while(pos > 0 && x < array[pos-1]){
                System.out.print("\nChange element in index '" + pos + "' = element in index '" + (pos - 1) +"' (" + array[pos-1] + ")");
                array[pos] = array[pos-1];

                pos--;
            }
            array[pos] = x;
            System.out.print("\nLet element in index '" + pos + "' = " + x);
            System.out.print("\n===========================================================================");
        }
    }

    public static String showList(int[] list) {
        String string = "";
        for (int j = 0; j < list.length; j++) {
            string += list[j] + " ";
        }
        return string;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter list size: ");
//        int size = scanner.nextInt();
//        int[] list = new int[size];
//        System.out.println("Enter " + list.length + " values: ");
//        for (int i = 0; i < list.length; i++) {
//            list[i] = scanner.nextInt();
//        }
        int[] list = {3,4,5,2,1};
        System.out.print("Your input list: " + showList(list));

        insertionSort(list);
        System.out.print("\nYour list after sort: " + showList(list));
    }
}
