package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScientificTests {

    ScientificCalc scientific = new ScientificCalc();

    // Sine Tests in Radians and Degrees
    @Test
    public void sinRadians() {
        double expected = 0;
        double actual = scientific.sine(0);
        assertEquals(expected, actual, 0.01);
    }

    /*
    @Test
    public void sinDegrees() {
        double expected = 0;
        double actual = scientific.sin(0);
        assertEquals(expected, actual, 0.01);
    }
    */

    // Cosine Tests in Radians and Degrees
    @Test
    public void cosRadians() {
        double expected = 1;
        double actual = scientific.cose(0);
        assertEquals(expected, actual, 0.01);
    }

     /*
    @Test
    public void cosDegrees() {
        double expected = 0;
        double actual = scientific.cos(0);
        assertEquals(expected, actual, 0.01);
    }
    */

    // Tangent Tests in Radians and Degrees
    @Test
    public void tanRadians() {
        double expected = 0;
        double actual = scientific.tangent(0);
        assertEquals(expected, actual, 0.01);
    }

     /*
    @Test
    public void tanDegrees() {
        double expected = 0;
        double actual = scientific.tan(0);
        assertEquals(expected, actual, 0.01);
    }
    */

    // Inverse Sine Tests in Radians and Degrees
    @Test
    public void inverseSinRadians() {
        double expected = 0;
        double actual = scientific.inverseSin(0);
        assertEquals(expected, actual, 0.01);
    }

     /*
    @Test
    public void inverseSinDegrees() {
        double expected = 0;
        double actual = scientific.inverseSin(0);
        assertEquals(expected, actual, 0.01);
    }
    */

    // Inverse Cosine Tests in Radians and Degrees
    @Test
    public void inverseCosRadians() {
        double expected = 0;
        double actual = scientific.inverseCos(1);
        assertEquals(expected, actual, 0.01);
    }

     /*
    @Test
    public void inverseCosDegrees() {
        double expected = 0;
        double actual = scientific.inverseCos(0);
        assertEquals(expected, actual, 0.01);
    }
    */

    // Inverse Tangent Tests in Radians and Degrees
    @Test
    public void inverseTanRadians() {
        double expected = 0;
        double actual = scientific.inverseTan(0);
        assertEquals(expected, actual, 0.01);
    }

     /*
    @Test
    public void inverseTanDegrees() {
        double expected = 0;
        double actual = scientific.inverseTan(0);
        assertEquals(expected, actual, 0.01);
    }
    */

     // Logarithmic Functions

    // Log
    @Test
    public void log () {
        double expected = 0;
        double actual = scientific.logarithm(1);
        assertEquals(expected, actual, 0.01);
    }

    // Inverse Log
    @Test
    public void inverseLog () {
        double expected = 100;
        double actual = scientific.inverseLog(2);
        assertEquals(expected, actual, 0.01);
    }

    // Natural Log
    @Test
     public void naturalLog () {
         double expected = 0;
         double actual = scientific.naturalLog(1);
         assertEquals(expected, actual, 0.01);
     }

     // Inverse Natural Log
    @Test
    public void inverseNaturalLog() {
        double expected = 1;
        double actual = scientific.inverseNaturalLog(0);
        assertEquals(expected, actual, 0.01);
    }

     // Factorial
     @Test
     public void factorial () {
        double expected = 120;
        double actual = scientific.factorial(5);
        assertEquals(expected, actual, 0.01);
     }

     // Simple Yearly Interest Calc
    @Test
    public void yearlyInterest () {
        double expected = 50;
        double actual = scientific.yearlyInterest(1000, 5);
        assertEquals(expected, actual, 0.01);
    }

}
