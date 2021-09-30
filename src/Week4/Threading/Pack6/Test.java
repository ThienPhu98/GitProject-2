package Week4.Threading.Pack6;

public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();

        try {
            while (lazy.getMyThread().isAlive() && optimized.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}
