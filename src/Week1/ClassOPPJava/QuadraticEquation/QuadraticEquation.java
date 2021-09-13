package Week1.ClassOPPJava.QuadraticEquation;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b,2) - (4 * this.a * this.c);
        return delta;
    }

    public double getRoot1(){
        double result1 = ((-this.b) + Math.pow(this.getDiscriminant(),0.5))/(2 * this.a);
        return result1;
    }

    public double getRoot2(){
        double result2 = ((-this.b) - Math.pow(this.getDiscriminant(),0.5))/(2 * this.a);
        return result2;
    }
}
