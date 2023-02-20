package com.niit.bej;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator=null;
    }

    @Test
    void addSuccess() {
        double expected=15;
        double actual=calculator.add(5,10);
        assertEquals(expected,actual);

    }
    @Test
    void addFailure() {
        double expected=12;
        double actual=calculator.add(5,10);
        assertNotEquals(expected,actual);

    }

    @Test
    void sub() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void modularDivision() {
    }
}