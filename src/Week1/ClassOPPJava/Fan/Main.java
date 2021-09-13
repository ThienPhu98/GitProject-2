package Week1.ClassOPPJava.Fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        int SLOW = 1, MEDIUM = 2, FAST = 3;

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
