package Week3.StackQueue.QueueCircleLink;

public class Solution {
    public static void main(String args[]) {
        Queue q = new Queue();

        System.out.print("Elements in Circular Queue is: ");
        displayQueue(q);

        q.enQueue(q,14);
        q.enQueue(q, 22);
        q.enQueue(q, 6);

        System.out.print("\nElements after enQueue in Circular Queue are: ");
        displayQueue(q);

        System.out.printf("\nDeleted value = %d", q.deQueue(q));
        System.out.printf("\nDeleted value = %d", q.deQueue(q));
        System.out.print("\nElements after deQueue in Circular Queue are: ");
        displayQueue(q);

        q.enQueue(q, 9);
        q.enQueue(q, 20);
        System.out.print("\nElements after enQueue in Circular Queue are: ");
        displayQueue(q);
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        if (temp == null) {
            System.out.print("Empty");
        } else {
            while (temp.link != q.front) {
                System.out.printf("%d ", temp.data);
                temp = temp.link;
            }
            System.out.printf("%d", temp.data);
        }
    }
}
