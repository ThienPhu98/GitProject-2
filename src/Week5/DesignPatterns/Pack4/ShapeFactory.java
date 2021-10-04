package Week5.DesignPatterns.Pack4;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("Circle".equals(type)) {
            return new Circle();
        }
        if ("Square".equals(type)) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
