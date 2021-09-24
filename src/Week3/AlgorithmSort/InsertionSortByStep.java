package Week3.AlgorithmSort;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.print("\nChange element:" + array[pos] +" in index " + pos + " to element:" + array[pos - 1] +" in index " + (pos-1));
                array[pos] = array[pos-1];

                pos--;
            }
            array[pos] = x;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: " + showList(list));

        insertionSort(list);
        System.out.print("\nYour list after sort: " + showList(list));
    }
}
