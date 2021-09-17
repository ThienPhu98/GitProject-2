package Week2.List.Pack2;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList Mylinkedlist = new LinkedList(10);
        Mylinkedlist.addFirst(7);
        Mylinkedlist.addFirst(3);
        Mylinkedlist.addFirst(1);

        Mylinkedlist.add(0,9);
        Mylinkedlist.add(1,9);
        Mylinkedlist.printList();
    }
}
