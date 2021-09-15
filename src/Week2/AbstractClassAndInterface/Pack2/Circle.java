package Week2.AbstractClassAndInterface.Pack2;

public class Circle {
    public double radius = 1.0;
    public String color = "red";
    public boolean filled = false;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
    }

    protected double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Circle: {" + "radius=" + radius + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
