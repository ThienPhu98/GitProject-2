package Week2.Inheritance.Point2;
import java.util.Arrays;

public class MoveablePoint extends Point {
    private float Xspeed = 0.0f;
    private float Yspeed = 0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint (float x, float y, float xspeed, float yspeed){
        super(x,y);
        this.Xspeed = xspeed;
        this.Yspeed = yspeed;
    }

    public float getXspeed() {
        return Xspeed;
    }
    public void setXspeed(float xspeed) {
        this.Xspeed = xspeed;
    }

    public float getYspeed() {
        return Yspeed;
    }
    public void setYspeed(float yspeed) {
        this.Yspeed = yspeed;
    }

    public void setSpeed(float xspeed, float yspeed) {
        this.Xspeed = xspeed;
        this.Yspeed = yspeed;
    }

    public float[] getSpeed(){
        float[] array = {Xspeed, Yspeed};
        return array;
    }

    @Override
    public String toString() {
        return super.toString() + " and speed= " + Arrays.toString(getSpeed());
    }

    public MoveablePoint move() {
        this.x += Xspeed;
        this.y += Yspeed;
        return this;
    }
}
