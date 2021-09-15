package Week2.AbstractClassAndInterface.Pack4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println("After Resize:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        double random = (Math.floor((Math.random() * 100) * 10) / 10);
        System.out.println("Before Resize (up '" + random +"%'):");
        circle.resize(random);
        rectangle.resize(random);
        square.resize(random);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
