package com.StackAndQueue;

public class QueueMyLinkedList<E> {
    private MyLinkedList<E> Queue;

    public QueueMyLinkedList() {
        Queue = new MyLinkedList<E>();
    }

    public void enqueue(E element) {
        Queue.addLast(element);
    }

    public void dequeue() {
        Queue.remove(Queue.getFirst());
    }

    public String showElement() {
        String elementList = "";
        for (int i = 0; i < Queue.size(); i++) {
            elementList += Queue.get(i) + " ";
        }
        if (elementList == "") {
            elementList = "the List is empty!";
        }
        return elementList;
    }
}
