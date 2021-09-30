package Week4.Threading.Pack6;

public class LazyPrimeFactorization implements Runnable {
    private Thread myThread;

    public Thread getMyThread() {
        return myThread;
    }

    public LazyPrimeFactorization() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 2; i < 100; i++) {
                if(Check(i)) {
                    System.out.println("LazyPrimeFactorization find a prime number is: " + i);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

    public static boolean Check(int number){
        if (number < 2){
            return false;
        } else if (number == 2){
            return true;
        } else {
            for (int index = 2 ; index < number; index++){
                if (number % index == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
