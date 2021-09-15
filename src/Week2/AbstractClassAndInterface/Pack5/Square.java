package Week2.AbstractClassAndInterface.Pack5;

public class Square extends Shape {
    public Square(String name) {
        super(name);
    }

    @Override
    public String howToColor() {
        return "Coloring 4 corners";
    }
}
