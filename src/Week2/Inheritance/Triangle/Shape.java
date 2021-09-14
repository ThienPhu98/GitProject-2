package Week2.Inheritance.Triangle;

public class Shape {
    private String color = "green";
    public double side1 = 1.0f;
    public double side2 = 1.0f;
    public double side3 = 1.0f;

    public Shape() {
    }

    public Shape(String color, double side1, double side2, double side3) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double x) {
        this.side1 = x;
    }

    public void setSide2(double y) {
        this.side2 = y;
    }

    public void setSide3(double z) {
        this.side3 = z;
    }

    @Override
    public String toString() {
        return "a Shape with 3 side is " + getSide1() + "," + getSide2() + "," + getSide3() + " and with color: " + getColor();
    }
}
