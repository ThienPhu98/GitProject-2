package AutomatedTesting;
import Week2.AutomatedTestingAndTDD.NextDayCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextDayCalculatorTest {

    @Test
    void testFindNextDay0() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFindNextDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFindNextDay2() {
        int day = 31;
        int month = 7;
        int year = 2018;
        String expected = "1/8/2018";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFindNextDay3() {
        int day = 30;
        int month = 8;
        int year = 2018;
        String expected = "31/8/2018";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFindNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFindNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFindNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2020;
        String expected = "1/1/2021";

        String result = NextDayCalculator.findNextDay(day, month, year);
        Assertions.assertEquals(expected, result);
    }
}
