package Week3.StackQueue.QueueCircleLink;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

}
