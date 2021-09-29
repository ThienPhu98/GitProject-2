package com.StackAndQueue;

import java.util.EmptyStackException;

public class StackMyLinkedList<E> {
    private MyLinkedList<E> stack;

    public StackMyLinkedList() {
        stack = new MyLinkedList<E>();
    }

    public void push(E element) {
        stack.addLast(element);
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        stack.remove(stack.getLast());
    }

    public int size()  {
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
        for (int i = 0; i < stack.size(); i++) {
            elementList += stack.get(i) + " ";
        }
        if (elementList == "") {
            elementList = "the List is empty!";
        }
        return elementList;
    }
}
