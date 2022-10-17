package Baitap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void reviewTriangle() {
    }

    @Test
    void testReviewTriangle1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.reviewTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testReviewTriangle2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.reviewTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testReviewTriangle3() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.reviewTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testReviewTriangle4() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.reviewTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testReviewTriangle5() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.reviewTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testReviewTriangle6() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.reviewTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }
}