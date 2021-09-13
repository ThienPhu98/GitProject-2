package Week1.MoreInJava.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public void Circle () {
    }
    public void Circle (double radius){
    }

    protected double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    protected Double getArea(){
        return Math.pow(this.getRadius(),2) * Math.PI;
    }
}
