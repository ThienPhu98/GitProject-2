package AutomatedTesting;

import Week2.AutomatedTestingAndTDD.TriangleClassifier;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TriangleClassifierTest {
    @Test
    public void testTriangleClassifier0() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "This is Equilateral Triangle";

        String result = TriangleClassifier.checkClassifier(sideA,sideB,sideC);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier1() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "This is Isosceles Triangle";

        String result = TriangleClassifier.checkClassifier(sideA,sideB,sideC);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier2() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "This is Right Triangle";

        String result = TriangleClassifier.checkClassifier(sideA,sideB,sideC);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier3() {
        int sideA = 5;
        int sideB = 2;
        int sideC = 4;
        String expected = "This is Normal Triangle";

        String result = TriangleClassifier.checkClassifier(sideA,sideB,sideC);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier4() {
        int sideA = -1;
        int sideB = -2;
        int sideC = -3;
        String expected = "This is not Triangle!";

        String result = TriangleClassifier.checkClassifier(sideA,sideB,sideC);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTriangleClassifier5() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 2;
        String expected = "This is not Triangle!";

        String result = TriangleClassifier.checkClassifier(sideA,sideB,sideC);
        Assertions.assertEquals(expected, result);
    }
}
