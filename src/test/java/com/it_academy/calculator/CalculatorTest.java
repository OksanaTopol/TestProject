package com.it_academy.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception{
        calculator = new Calculator();
    }
    /////sum
    @Test
    public void testSum(){
        assertEquals("Regular sum should work",
                13, calculator.sum(6,7), 0.01);
    }
    @Test
    public void testSumWithZero(){
        assertEquals("Regular sum with zero should work",
                6, calculator.sum(6,0), 0.01);
    }
    @Test
    public void testSumWithSymbol_expectedErrorMessage(){
        assertEquals("Error exception is expected",
                47, calculator.sum(6,')'), 0.01);
    }

    @Test
    public void testMinus(){
        assertEquals("Regular minus should work",
                8.3, calculator.minus(15.8,7.5), 0.01);
    }
    @Test
    public void testMinusZero(){
        assertEquals("Regular minus zero should work",
                15.6, calculator.minus(15.6,0), 0.01);
    }
    @Test
    public void testMinusFromZero(){
        assertEquals("Regular minus from zero should work",
                -15.1, calculator.minus(0,15.1), 0.01);
    }
    @Test
    public void testMinusFromSymbol_expectedErrorMessage(){
        assertEquals("Regular minus from zero should work",
                98.4, calculator.minus('g',4.6), 0.01);
    }

    @Test
    public void testMultiply(){
        assertEquals("Regular multiplication should work",
                21.28,   calculator.multiply(3.8,5.6), 0.01);
    }

    @Test
    public void testMultiplyWithNegativeValue() {
        assertEquals("Regular multiplication with negative value should work",
                -24.19, calculator.multiply(-4.1,5.9), 0.01);
    }

    @Test
    public void testMultiplyWithZero(){
        assertEquals("Multiplication with zero should be zero",
                0, calculator.multiply(0,5), 0.01);
        assertEquals("Multiplication with zero should be zero",
                0, calculator.multiply(4,0), 0.01);
    }

    @Test
    public void testDivide(){
        assertEquals("Regular dividing should work",
                6,  calculator.divide(30,5), 0.01);
    }

    @Test
    public void testDivideOnZero_expectedErrorMessage(){
        assertEquals("Dividing on zero is impossible",
                Double.POSITIVE_INFINITY, calculator.divide(30,0), 0.01);
    }

    @Test
    public void testDivideZero_expectedErrorMessage(){
        assertEquals("Dividing zero gives result zero",
                0 , calculator.divide(0,30), 0.01);
    }
}
