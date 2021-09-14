package Week2.Inheritance.Triangle;

public class Triangle extends Shape {
    private double height = 1.0f;

    public Triangle() {
    }

    public Triangle(String color, double size1, double size2, double size3, double height) {
        super(color,size1,size2,size3);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public double getArea() {
        double max;
        if (side1 >= side2 && side1 >= side3) {
            max = side1;
        } else if (side2 >= side1 && side2 >= side3) {
            max = side2;
        } else {
            max = side3;
        }
        return (height * max * 0.5);
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "The Triangle with height= " + getHeight()
                + " which is " + super.toString()
                + " has Area = " + getArea()
                + " and Perimeter= " + getPerimeter();
    }
}
