package Week2.AbstractClassAndInterface.Pack5;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public String howToColor() {
        return "Coloring along the circle";
    }
}
