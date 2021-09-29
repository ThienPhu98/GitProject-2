package com.StackAndQueue;

public class QueueArray<E> {
    private int capacity = 0;
    private E queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public QueueArray() {
        queueArr = (E[]) new  Object[this.capacity];
    }

    public QueueArray(int queueSize) {
        this.capacity = queueSize;
        queueArr = (E[]) new  Object[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enqueue(E element) {
        if (isQueueFull()) {
            tail++;
            capacity += 1;
            E[] arr = (E[]) new Object[capacity];
            for (int i = 0; i < capacity - 1; i++) {
                arr[i] = queueArr[i];
            }
            queueArr = (E[]) new Object[capacity];
            for (int i = 0; i < capacity - 1; i++) {
                queueArr[i] = arr[i];
            }
            queueArr[tail] = element;
            currentSize++;
            System.out.print("\nElement " + element + " is pushed to Queue !");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = element;
            currentSize++;
            System.out.print("\nElement " + element + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.print("\nUnderflow ! Unable to remove element from Queue");
        } else {
            capacity = capacity - 1;
            E[] arr = (E[]) new Object[capacity];
            for (int i = 0; i < capacity; i++) {
                arr[i] = queueArr[i+1];
            }
            queueArr = (E[]) new Object[capacity];
            for (int i = 0; i < capacity; i++) {
                queueArr[i] = arr[i];
            }
            currentSize--;
            tail--;
        }
    }

    public String showElement() {
        String elementList = "";
        for (E element : queueArr) {
            elementList += element + " ";
        }
        if (elementList == "") {
            elementList = "the List is empty!";
        }
        return elementList;
    }
}
