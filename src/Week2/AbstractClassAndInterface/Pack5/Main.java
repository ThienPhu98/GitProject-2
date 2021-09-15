package Week2.AbstractClassAndInterface.Pack5;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Circle");
        shape[1] = new Triangle("Triangle");
        shape[2] = new Square("Square");

        for (Shape Shape : shape) {
            System.out.println("Way to Color " + Shape.name + ": " + Shape.howToColor());
        }
    }
}
