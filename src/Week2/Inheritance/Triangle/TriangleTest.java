package Week2.Inheritance.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);

        Triangle triangle2 = new Triangle("yellow", 4, 5, 6, 4);
        System.out.println(triangle2);
    }
}
