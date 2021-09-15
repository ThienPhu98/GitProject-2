package Week2.AbstractClassAndInterface.Pack4;

public class Square implements Resizeable {
    public double side = 2.0;
    public String color = "black";
    public boolean filled = false;

    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        return "Square: {" + "side= " + side + ", color= '" + color + '\'' + ", filled= " + filled + '}';
    }

    @Override
    public Double resize(double x) {
        return side += side * (x/100);
    }
}
