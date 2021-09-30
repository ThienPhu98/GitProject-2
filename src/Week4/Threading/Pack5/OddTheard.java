package Week4.Threading.Pack5;

public class OddTheard extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
