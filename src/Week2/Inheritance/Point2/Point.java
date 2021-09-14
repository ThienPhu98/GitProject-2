package Week2.Inheritance.Point2;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point(){
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public void setX(float x){
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {x,y};
        return array;
    }

    @Override
    public String toString(){
        return "Point has position x= " + getX() + " and y = " + getY();
    }
}
