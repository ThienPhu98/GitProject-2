package Week2.List.Pack4;

public class LinkedTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("MyLinkedList: " + showList(list));

        list.addFirst(12);
        list.addFirst(10);
        list.addFirst(7);
        list.addFirst(4);
        list.addFirst(9);
        list.addFirst(3);
        System.out.print("\nMyLinkedList after add elements: " + showList(list));

        System.out.print("\nThe first element in MyLinkedList is: " + list.getFirst());

        System.out.print("\nThe last element in MyLinkedList is: " + list.getLast());

        list.add(3, 15);
        System.out.print("\nMyLinkedList after add element '15' at position 3 is: " + showList(list));

        list.remove(5);
        System.out.print("\nMyLinkedList after remove element at position 5 is: " + showList(list));

        list.remove((Object) 9);
        System.out.print("\nMyLinkedList after remove element '9' is: " + showList(list));

        System.out.print("\nPosition of element '7' in MyLinkedList is: " + list.indexOf(7));

        list.clear();
        System.out.print("\nMyLinkedList after clear is: " + showList(list));

    }

    public static String showList(LinkedList<Integer> list){
        String List = "";
        for (int i = 0; i < list.size(); i++) {
            List += list.get(i) + " ";
        }

        if (List == "") {
            return "List is Empty";
        } else {
            return List;
        }
    }
}
