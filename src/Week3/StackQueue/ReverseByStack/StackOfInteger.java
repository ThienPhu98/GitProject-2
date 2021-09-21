package Week3.StackQueue.ReverseByStack;

class StackOfInteger {
    int size;
    int top;
    int[] array;

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    StackOfInteger(int ArraySize) {
        top = -1;
        size = ArraySize;
        array = new int[size];
    }

    boolean push(int number) {
        if (top >= size) {
            System.out.println("StackOfInteger Overflow");
            return false;
        }
        else {
            array[++top] = number;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("StackOfInteger Underflow");
            return 0;
        }
        else {
            int number = array[top--];
            return number;
        }
    }

}