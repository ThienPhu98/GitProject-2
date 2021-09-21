package Week3.StackQueue.ChangeDecimalToBinary;

public class Stack {
    int size;
    int top;
    char[] array;

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int number) {
        top = -1;
        size = number;
        array = new char[size];
    }

    boolean push(char letter) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            array[++top] = letter;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            char x = array[top--];
            return x;
        }
    }
}
