package Week5.StructuralDesignPattern.Pack5;

import java.util.List;

public class RandomListFacade {
    private RandomList list;
    private ListFilter filter;
    private ListPrinter printer;

    public RandomListFacade() {
        list = new<Integer> RandomList();
        filter = new ListFilter();
        printer = new ListPrinter();
    }

    public void printNumber(int size, int min, int max) {
        List<Integer> randomList = list.generateList(size, min, max);
        List<Integer> filterList = filter.filterOdd(randomList);
        printer.printList(filterList);
    }
}
