package com.StackAndQueue;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private E data;

        public Node(E data){
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (index >=0 || index <= numNodes){
            if (index == 0) {
                addFirst(element);
            } else if (index == numNodes) {
                addLast(element);
            } else {
                Node current = head;
                for (int i = 1; i < index; i++)
                    current = current.next;
                Node temp = current.next;
                current.next = new Node(element);
                (current.next).next = temp;
                numNodes++;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        numNodes++;
        if (head == null) {
            head = new Node(e);
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
        }
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        E data;

        if (index == 0) {
            data = temp.data;
            head =head.next;
        } else {
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            data = temp.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return data;
    }

    public boolean remove(Object e){
        if(head.data.equals(e)){
            remove(0);
            return  true;
        }else {
            Node temp = head;
            while(temp.next != null){
                if(temp.next.data.equals(e)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return  true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public int size(){
        return numNodes;
    }

    public boolean isEmpty() {
        if (numNodes == 0) {
            return true;
        }
        return false;
    }

    public MyLinkedList clone(){
        if(numNodes == 0){
            throw new NullPointerException();
        }
        MyLinkedList<E> temp = new MyLinkedList<E>();
        Node tempNode = head;
        temp.addFirst(tempNode.data);
        tempNode = tempNode.next;
        for(;tempNode != null; tempNode = tempNode.next){
            temp.addLast(tempNode.data);
        }
        return temp;
    }

    public boolean contain(E o){
        Node temp = head;
        for(;temp.next != null;temp = temp.next){
            if(temp.data.equals(o)){
                return true;
            }
        }
        if(temp.data.equals(o)){
            return true;
        }
        return false;
    }

    public int indexOf(E o){
        Node temp = head;
        for(int i = 0; i < numNodes; i++){
            if(temp.getData() == o){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e){
        addLast(e);
        return true;
    }

    public E get(int i){
        Node temp = null;
        if (head == null) {
            return (E) temp;
        } else {
            temp = head;
            for(int j = 0; j < i; j++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public E getFirst(){
        Node temp = head;
        return temp.data;
    }

    public E getLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear(){
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            head.data = null;
            head = temp;
        }
    }

}
