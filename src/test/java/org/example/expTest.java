package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class expTest {
    @Test
    void testMethodEquals() {
        taskOne taskOne = new taskOne(2);
        double y = taskOne.resolveExpression();
        double scale = Math.pow(10, 3);
        double result = Math.ceil(y * scale) / scale;
        assertEquals(result, 2.843);

    }

    @Test
    void testMethodNoCondition() {
        double y, r;
        r = 5;
        taskOne taskOne = new taskOne(6);
        y = taskOne.resolveExpression();
        boolean condRes = taskOne.isConditionExpression(5, y, r);
        assertFalse(condRes);

    }

    @Test
    void testMethodN1() {
        double n1;
        n1 = -2;
        taskTwo taskTwo =  new taskTwo(n1);
        double res = taskTwo.isConditions();
        double scale = Math.pow(10, 3);
        double result = Math.round(res * scale) / scale;
        assertEquals(result, -136.484);

    }

    @Test
    void testMethodN2() {
        double n2;
        n2 = 0.5;
        taskTwo taskTwo =  new taskTwo(n2);
        double res = taskTwo.isConditions();
        double scale = Math.pow(10, 3);
        double result = Math.round(res * scale) / scale;
        assertEquals(result, 0.841);

    }

    @Test
    void testMethodN3() {
        double n3;
        n3 = 1.2;
        taskTwo taskTwo =  new taskTwo(n3);
        double res = taskTwo.isConditions();
        double scale = Math.pow(10, 3);
        double result = Math.round(res * scale) / scale;
        assertEquals(result, 0.503);

    }
}
