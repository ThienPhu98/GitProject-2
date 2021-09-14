package Week2.Inheritance.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder(){
    }

    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height= " + getHeight() + " and Volume= " + getVolume() + " Which is " + super.toString();
    }
}
