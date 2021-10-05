package Week5.StructuralDesignPattern.Pack5;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> numbers){
        for (Integer number: numbers) {
            System.out.print(number + " ");
        }
    }
}
