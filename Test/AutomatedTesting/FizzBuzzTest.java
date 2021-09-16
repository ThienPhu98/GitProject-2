package AutomatedTesting;

import Week2.AutomatedTestingAndTDD.FizzBuzz;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz0() {
        int number = 0;
        String expected = "FizzBuzz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz1() {
        int number = 12;
        String expected = "Fizz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz2() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz3() {
        int number = 33;
        String expected = "Fizz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz4() {
        int number = 55;
        String expected = "Buzz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz5() {
        int number = 1000;
        String expected = "Number Input out of Ability!!!";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz6() {
        int number = -1;
        String expected = "Number Input out of Ability!!!";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz7() {
        int number = 13;
        String expected = "Fizz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz8() {
        int number = 52;
        String expected = "Buzz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz9() {
        int number = 356;
        String expected = "FizzBuzz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz10() {
        int number = 953;
        String expected = "FizzBuzz";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz11() {
        int number = 79;
        String expected = "seventy nine";

        String result = FizzBuzz.ChangeFizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
}
