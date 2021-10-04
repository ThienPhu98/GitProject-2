package Week5.DesignPatterns.Pack4;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Square");
        System.out.print("Factory draw shape 1:");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Circle");
        System.out.print("\nFactory draw shape 2:");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        System.out.print("\nFactory draw shape 3:");
        shape3.draw();
    }
}
