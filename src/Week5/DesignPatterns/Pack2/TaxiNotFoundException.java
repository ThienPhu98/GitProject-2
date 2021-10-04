package Week5.DesignPatterns.Pack2;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
