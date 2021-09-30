package Week4.Threading.Pack5;

public class Test {
    public static void main(String[] args) {
        OddTheard oddTheard = new OddTheard();
        EvenThread evenThread = new EvenThread();

        oddTheard.run();
        try {
            oddTheard.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        evenThread.run();
    }
}
