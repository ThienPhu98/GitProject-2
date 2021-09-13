package Week1.ClassOPPJava.Fan;

public class Fan {
    int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }
    public int setSpeed(int speed){
        this.speed = speed;
        return this.speed;
    }

    public boolean getStatus(){
        return this.status;
    }
    public boolean setStatus(boolean status){
        this.status = status;
        return this.status;
    }

    public double getRadius(){
        return this.radius;
    }
    public double setRadius (double radius){
        this.radius = radius;
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }
    public String setColor(String color) {
        this.color = color;
        return this.color;
    }

    public String toString(){
        String str = "Speed: " + this.getSpeed() + ", radius: " + this.getRadius() + ", color: " + this.getColor();
        if (this.getStatus() == true) {
            str += ", fan is on";
        } else {
            str += ", fan is off";
        }
        return str;
    }
}
