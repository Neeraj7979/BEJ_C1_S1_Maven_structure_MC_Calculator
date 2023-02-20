package com.niit.bej;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void addSuccess() {
        double expected = 15;
        double actual = calculator.add(5, 10);
        assertEquals(expected, actual);

    }

    @Test
    void addFailure() {
        double expected = 12;
        double actual = calculator.add(5, 10);
        assertNotEquals(expected, actual);

    }

    @Test
    void subSuccess() {
        double expected = 5;
        double actual = calculator.sub(5, 10);
        assertEquals(expected, actual);
    }

    @Test
    void subFailure() {
        double expected = 12;
        double actual = calculator.sub(5, 10);
        assertNotEquals(expected, actual);

    }

    @Test
    void multiplySuccess() {
        double expected = 50;
        double actual = calculator.multiply(5, 10);
        assertEquals(expected, actual);
    }

    @Test
    void multiplyFailure() {
        double expected = 45;
        double actual = calculator.multiply(5, 10);
        assertNotEquals(expected, actual);
    }

    @Test
    void divideByZero() {
        double expected = 0;
        double actual = calculator.divide(0, 34);
        assertEquals(expected, actual);
    }

    @Test
    void modularDivision() {
        double expected = 0;
        double actual = calculator.modularDivision(10, 5);
        assertEquals(expected, actual);
    }
}