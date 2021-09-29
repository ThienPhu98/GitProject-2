package com.StackAndQueue;

public class TestList<E> {
    public static void main(String[] args) throws Exception {
        System.out.print("Test Stack using Array");
        StackArray<String> stackArray = new StackArray();
        System.out.print("\nList of elements: " + stackArray.showElement());

        stackArray.push("Hello");
        stackArray.push("Code");
        stackArray.push("Gym");
        stackArray.push("I");
        stackArray.push("am");
        stackArray.push("Phu");

        System.out.print("\nList of element after add 6 elements: "+ stackArray.showElement());

        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        System.out.print("\nList of element after pop 3 elements: "+ stackArray.showElement());

        stackArray.push("I");
        stackArray.push("am");
        stackArray.push("Bob");
        System.out.print("\nList of element after add 3 elements: "+ stackArray.showElement());

        System.out.print("\n===========================================================================================");

        System.out.print("\nTest Stack using LinkedList of Java:");
        StackLinkedList<String> stackLinkedList = new StackLinkedList();
        System.out.print("\nList of elements: " + stackLinkedList.showElement());

        stackLinkedList.push("Gym");
        stackLinkedList.push("Code");
        stackLinkedList.push("To");
        stackLinkedList.push("Welcome");
        stackLinkedList.push("GoodMorning!");
        System.out.print("\nList after push 5 elements: " + stackLinkedList.showElement());

        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        System.out.print("\nList after pop 3 elements: " + stackLinkedList.showElement());

        stackLinkedList.push("Welcome");
        stackLinkedList.push("GoodEvening!");
        System.out.print("\nList after push 2 elements: " + stackLinkedList.showElement());

        System.out.print("\n===========================================================================================");

        System.out.print("\nTest Stack using MyLinkedList:");
        StackMyLinkedList<String> stackMyLinkedList = new StackMyLinkedList<>();
        System.out.print("\nList of elements: " + stackMyLinkedList.showElement());

        stackMyLinkedList.push("GoodAfterNoon!");
        stackMyLinkedList.push("Welcome");
        stackMyLinkedList.push("To");
        stackMyLinkedList.push("Code");
        stackMyLinkedList.push("Gym");
        System.out.print("\nList after push 5 elements: " + stackMyLinkedList.showElement());

        stackMyLinkedList.pop();
        stackMyLinkedList.pop();
        System.out.print("\nList after pop 2 elements: " + stackMyLinkedList.showElement());

        stackMyLinkedList.push("My");
        stackMyLinkedList.push("House");
        System.out.print("\nList after push 2 elements: " + stackMyLinkedList.showElement());

        System.out.print("\n===========================================================================================");
        System.out.print("\nTest Queue using Array:");
        QueueArray<String> queueArray = new QueueArray<>();
        System.out.print("\nList of elements: " + queueArray.showElement());

        queueArray.enqueue("Hello");
        queueArray.enqueue("I");
        queueArray.enqueue("am");
        queueArray.enqueue("Phu");
        System.out.print("\nList after add 4 elements: " + queueArray.showElement());

        queueArray.dequeue();
        queueArray.dequeue();
        queueArray.dequeue();
        System.out.print("\nList after pop 3 elements: " + queueArray.showElement());

        queueArray.enqueue("is");
        queueArray.enqueue("me!");
        System.out.print("\nList after add 2 elements: " + queueArray.showElement());

        System.out.print("\n===========================================================================================");
        System.out.print("\nTest Queue using LinkedList of Java:");
        QueueLinkedList<String> queueLinkedList = new QueueLinkedList<>();
        System.out.print("\nList of elements: " + queueLinkedList.showElement());

        queueLinkedList.enqueue("GoodMorning!");
        queueLinkedList.enqueue("Welcome");
        queueLinkedList.enqueue("To");
        queueLinkedList.enqueue("Code");
        queueLinkedList.enqueue("Gym");
        System.out.print("\nList after add 5 elements: " + queueLinkedList.showElement());

        queueLinkedList.dequeue();
        System.out.print("\nList after pop 1 element: " + queueLinkedList.showElement());

        queueLinkedList.enqueue("Center");
        System.out.print("\nList after add 1 element: " + queueLinkedList.showElement());

        System.out.print("\n===========================================================================================");
        System.out.print("\nTest Queue using MyLinkedList:");
        QueueMyLinkedList<String> queueMyLinkedList = new QueueMyLinkedList<>();
        System.out.print("\nList of elements: " +  queueMyLinkedList.showElement());

        queueMyLinkedList.enqueue("GoodAfternoon!");
        queueMyLinkedList.enqueue("Welcome");
        queueMyLinkedList.enqueue("To");
        queueMyLinkedList.enqueue("Code");
        queueMyLinkedList.enqueue("Gym");
        System.out.print("\nList after add 5 elements: " + queueMyLinkedList.showElement());

        queueMyLinkedList.dequeue();
        System.out.print("\nList after add 1 element: " + queueMyLinkedList.showElement());

        queueMyLinkedList.enqueue("Center");
        System.out.print("\nList after add 1 element: " + queueMyLinkedList.showElement());
    }
}
