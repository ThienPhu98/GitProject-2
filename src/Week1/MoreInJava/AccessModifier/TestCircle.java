package Week1.MoreInJava.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Color of circle: " + circle.getColor());
        System.out.println("Area of circle: " + circle.getArea());
    }
}
