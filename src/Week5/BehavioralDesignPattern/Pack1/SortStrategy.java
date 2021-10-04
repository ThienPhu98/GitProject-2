package Week5.BehavioralDesignPattern.Pack1;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
