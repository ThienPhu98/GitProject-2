package Week1.ClassOPPJava.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        String request = "";

        do {
            System.out.println("Enter 'begin' to start the Stopwatch: ");
            request = scanner.nextLine().toString();
            if (request.equals("begin")){
                watch.Start();
            }
        } while (!request.equals("begin"));

        do {
            System.out.println("Enter 'end' to stop the Stopwatch: ");
            request = scanner.nextLine();
            if (request.equals("end")){
                watch.End();
                System.out.println("Elapsed time: " + watch.getElapsedTimeSecs() + " second");
            }
        } while (!request.equals("end"));

    }
}
