package com.StackAndQueue;

import java.util.LinkedList;

public class QueueLinkedList<E> {
    private LinkedList<E> Queue;

    public QueueLinkedList() {
        Queue = new LinkedList<E>();
    }

    public void enqueue(E element) {
        Queue.addLast(element);
    }

    public void dequeue() {
        Queue.removeFirst();
    }

    public String showElement() {
        String elementList = "";
        for (E element : Queue) {
            elementList += element + " ";
        }
        if (elementList == "") {
            elementList = "the List is empty!";
        }
        return elementList;
    }
}
