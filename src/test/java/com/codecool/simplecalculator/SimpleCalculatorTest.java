package com.codecool.simplecalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleCalculatorTest {

    @Test
    public void testIsNumberValid() {
        assertNotNull(SimpleCalculator.isNumber("2"));
    }

    @Test
    public void testIsNumberNotValid() {
        assertNull(SimpleCalculator.isNumber("x"));
    }

    @Test
    public void testIsValidOperatorValid() {
        assertTrue(SimpleCalculator.isValidOperator("+"));
    }

    @Test
    public void testCalcPlus() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a + b), SimpleCalculator.calc("+", a, b));
    }

    @Test
    public void testCalcMinus() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a - b), SimpleCalculator.calc("-", a, b));
    }

    @Test
    public void testCalcMultiply() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a * b), SimpleCalculator.calc("*", a, b));
    }

    @Test
    public void testCalcDivision() {
        float a = 3;
        float b = 4;
        assertEquals((Float)(a / b), SimpleCalculator.calc("/", a, b));
    }

}
