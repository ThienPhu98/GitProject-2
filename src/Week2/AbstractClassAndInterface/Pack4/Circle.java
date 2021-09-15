package Week2.AbstractClassAndInterface.Pack4;

public class Circle implements Resizeable{
    public double radius = 1.0;
    public String color = "red";
    public boolean filled = false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    protected double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public String toString() {
        return "Circle: {" + "radius= " + getRadius() + ", color= '" + color + '\'' + ", filled= " + filled + '}';
    }

    @Override
    public Double resize(double x) {
        return radius += radius * (x/100);
    }
}
