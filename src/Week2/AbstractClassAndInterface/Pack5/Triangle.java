package Week2.AbstractClassAndInterface.Pack5;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public String howToColor() {
        return "Coloring 3 corners";
    }
}
