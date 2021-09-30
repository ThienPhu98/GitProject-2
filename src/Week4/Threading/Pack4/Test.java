package Week4.Threading.Pack4;

public class Test {
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator();
        NumberGenerator number2 = new NumberGenerator();
        try {
            while (number1.getMyThread().isAlive() && number2.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
        System.out.println("Main thread interrupted");
    }
        System.out.println("Main thread run is over" );
    }
}
