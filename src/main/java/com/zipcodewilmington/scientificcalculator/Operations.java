package com.zipcodewilmington.scientificcalculator;

public class Operations {

    // For Merging Purposes

    // CORE FEATURES
    //====================================================

    // Addition
    public static long add(long a, long b){
        return a + b;
    }

    //Subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public double multiply (double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public double divide (double num1, double num2) {
        return num1 / num2;
    }

    // Number Squared
    public double square (double num1) {
        return num1 * num1;
    }

    // Square Root of Number
    public double squareRoot (double num1) {
        return Math.sqrt(num1);
    }

    // Exponent
    public double exponent (double num1, double num2) {
        return Math.pow (num1, num2);
    }

    // Inverse
    public double inverse (double num1) {
        return (1 / num1);
    }

    // Switch from Positive to Negative
    public double switchSign (double num1) {
        return (-1 * num1);
    }

    // Display Error if Divide by 0

    // Clear Error Before New Operation

}
