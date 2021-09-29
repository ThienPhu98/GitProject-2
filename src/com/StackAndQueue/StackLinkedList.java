package com.StackAndQueue;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<T> {
    private LinkedList<T> stack;

    public StackLinkedList() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public String showElement() {
        String elementList = "";
        for (T element : stack) {
            elementList += element + " ";
        }
        if (elementList == "") {
            elementList = "the List is empty!";
        }
        return elementList;
    }
}
