package Week4.Threading.Pack6;

public class OptimizedPrimeFactorization implements Runnable {
    private Thread myThread;

    public Thread getMyThread() {
        return myThread;
    }

    public OptimizedPrimeFactorization() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("OptimizedPrimeFactorization find a prime number is: 2");
            for (int i = 3; i < 100; i+=2) {
                if(Check(i)){
                    System.out.println("OptimizedPrimeFactorization find a prime number is: " + i);
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
