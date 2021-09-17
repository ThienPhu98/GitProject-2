package Week2.List.Pack3;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Double> list = new MyList<Double>(12);

        System.out.print("MyList: ");
        System.out.print("\n" + outPutList(list));

        System.out.print("MyList after add 6 elements: ");
        list.add(0, 5.5);
        list.add(1, 4.0);
        list.add(2, 2.3);
        list.add(3, 7.1);
        list.add(4, 6.5);
        list.add(5, 7.7);
        System.out.print("\n" + outPutList(list));

        System.out.print("\nPosition of element '4.0' in MyList : ");
        System.out.print(list.indexOf(4.0));

        System.out.print("\nFind element at position 5 in MyList : ");
        System.out.print(list.get(5));

        System.out.print("\nMyList after remove element at index 3: " + list.size());
        list.remove(3);
        System.out.print("\n" + outPutList(list));

        System.out.print("\nMyList after clear: ");
        list.clear();
        System.out.print("\n" + outPutList(list));
    }

    public static String outPutList(MyList<Double> list) {
        String List = "";
        for (int index = 0; index < list.length(); index++) {
            List += (list.get(index) + " ");
        }
        return List;
    }
}
