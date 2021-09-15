package Week2.AbstractClassAndInterface.Pack4;

public class Rectangle implements Resizeable {
    public double height = 4.0;
    public double width = 3.0;
    public String color = "blue";
    public boolean filled = true;

    public Rectangle(){
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        return "Rectangle: {" + "height= " + height + ", width= " + width + ", color= '" + color + '\'' + ", filled= " + filled + '}';
    }

    @Override
    public Double resize(double x) {
        height += height * (x/100);
        return width += width * (x/100);
    }
}
