package Week4.Threading.Pack4;

import java.util.Random;

public class NumberGenerator implements Runnable{
    private Thread myThread;

    public Thread getMyThread() {
        return myThread;
    }

    public NumberGenerator() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int number = (int) (Math.random()*100 + 1);
                System.out.println("The Random Number Generator is: " + number);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
