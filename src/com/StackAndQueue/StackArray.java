package com.StackAndQueue;

import java.util.Arrays;

public class StackArray<E> {
    private E[] arr;
    private int size = 0;
    private int index = 0;

    public StackArray() {
        arr = (E[]) new Object[size];
    }

    public StackArray(int size) {
        this.size = size;
        arr = (E[]) new Object[size];
    }

    public void push(E element){
        if (isFull()) {
            size = size + 1;
            E[] arr1 = (E[]) new Object[size];
            for (int i = 0; i < size - 1; i++) {
                arr1[i] = arr[i];
            }
            arr = (E[]) new Object[size];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr1[i];
            }
        }
        arr[index] = element;
        index++;
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        size = size - 1;
        index--;
        E[] arr1 = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
        arr = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = arr1[i];
        }
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public String showElement() {
        String elementList = "";
        for (E element : arr) {
            elementList += element + " ";
        }
        if (elementList == "") {
            elementList = "the List is empty!";
        }
        return elementList;
    }
}
