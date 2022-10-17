package Baitap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
    }

    @Test
    void testTranslate1() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testTranslate2() {
        int number = 22;
        String expected = "22";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testTranslateAdvance() {
        int number = 59;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translateAdvance(number);
        assertEquals(expected, result);
    }

    @Test
    void testTranslateToString() {
        int number = 24;
        String expected = "Hai Bon";
        String result = FizzBuzzTranslate.translateToString(number);
        assertEquals(expected, result);
    }
}