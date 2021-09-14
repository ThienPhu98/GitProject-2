package Week2.Inheritance.Point2;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint point1 = new MoveablePoint();
        System.out.println(point1);

        MoveablePoint point2 = new MoveablePoint(5.0f, 4.0f, 7.5f, 5.5f);
        System.out.println(point2);
    }
}
