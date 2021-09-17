package Week2.AutomatedTestingAndTDD;

import java.util.EventListener;

public class TriangleClassifier {
    public static String checkClassifier(int sideA, int sideB, int sideC){
        if (checkTriangle(sideA, sideB, sideC)) {
            if (sideA == sideB && sideA == sideC) {
                return "This is Equilateral Triangle";
            } else if (Math.pow(sideA,2) == Math.pow(sideB,2) + Math.pow(sideC,2)
                    || Math.pow(sideB,2) == Math.pow(sideA,2) + Math.pow(sideC,2)
                    || Math.pow(sideC,2) == Math.pow(sideA,2) + Math.pow(sideB,2)){
                return "This is Right Triangle";
            } else if (sideA == sideB || sideA == sideC || sideC == sideB) {
                return "This is Isosceles Triangle";
            } else {
                return "This is Normal Triangle";
            }
        } else {
            return "This is not Triangle!";
        }
    }

    public static boolean checkTriangle(int sideA, int sideB, int sideC) {
        if (sideA > 0 && sideB > 0 && sideC >0) {
            if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
