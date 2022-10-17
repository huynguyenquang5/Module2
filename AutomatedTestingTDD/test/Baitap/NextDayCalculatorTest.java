package Baitap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void dayTomorrow() {
    }

    @Test
    void testDayTomorrow1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int expected = 2;
        int result = NextDayCalculator.dayTomorrow(day,month,year);
        assertEquals(expected, result);
    }

    @Test
    void testDayTomorrow2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int expected = 1;
        int result = NextDayCalculator.dayTomorrow(day,month,year);
        assertEquals(expected, result);
    }

    @Test
    void testDayTomorrow3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expected = 1;
        int result = NextDayCalculator.dayTomorrow(day,month,year);
        assertEquals(expected, result);
    }


    @Test
    void testDayTomorrow4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expected = 1;
        int result = NextDayCalculator.dayTomorrow(day,month,year);
        assertEquals(expected, result);
    }

    @Test
    void testDayTomorrow5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int expected = 1;
        int result = NextDayCalculator.dayTomorrow(day,month,year);
        assertEquals(expected, result);
    }

    @Test
    void testDayTomorrow6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int expected = 1;
        int result = NextDayCalculator.dayTomorrow(day,month,year);
        assertEquals(expected, result);
    }
}