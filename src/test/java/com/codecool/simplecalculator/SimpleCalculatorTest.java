package com.codecool.simplecalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleCalculatorTest {

    @Test
    public void testIsNumberValid() {
        // test isNumber method with the value: 11
    }

    @Test
    public void testIsNumberNotValid() {
        // test isNumber method with the value: "xyz"
    }

    @Test
    public void testIsValidOperatorValid() {
        // test isValidOperator method with the value: "*"
    }

    @Test
    public void testCalcPlus() {
        // test addition using the calc method with the values: "+", 5, 7
    }

    @Test
    public void testCalcMinus() {
        // test subtraction using the calc method with the values: "-", 5, 7
    }

    @Test
    public void testCalcMultiply() {
        // test multiplication using the calc method with the values: "*", 5, 7
    }

    @Test
    public void testCalcDivision() {
        // test division using the calc method with the values: "/", 5, 7
    }

}
