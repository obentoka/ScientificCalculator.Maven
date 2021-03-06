package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static Scanner scanner;

    public static String getStringInput(String prompt) {

        scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return "Hello there " + userInput + "!";
    }

    public static int getIntegerInput(String prompt) {

        int userInput;

        scanner = new Scanner(System.in);
        println(prompt);
        String nextNum = scanner.nextLine();

        try{
            userInput = Integer.parseInt(nextNum);
            return userInput;
        }catch (Exception e) {
            return Console.getIntegerInput(prompt);
        }
    }

    public static Double getDoubleInput(String prompt) {

        double userInput;
        Display dis = new Display();

        scanner = new Scanner(System.in);
        println(prompt);
        String nextNum = scanner.nextLine();

        try{
            userInput = Double.parseDouble(nextNum);
            dis.update(userInput);
            return userInput;
        }catch (Exception e) {
            return Console.getDoubleInput(prompt);
        }

    }

    public static int getOperand(String prompt){

        scanner = new Scanner(System.in);
        println(prompt);
        String nextOperand = scanner.nextLine();

        if(nextOperand.equals("+")){
            return 1;
        }else if(nextOperand.equals("-")){
            return 2;
        }else if(nextOperand.equals("*")){
            return 3;
        }else if(nextOperand.equals("/")){
            return 4;
        }else if(nextOperand.equalsIgnoreCase("x^2")){
            return 5;
        }else if(nextOperand.equalsIgnoreCase("sqrt")){
            return 6;
        }else if(nextOperand.equalsIgnoreCase("x^n")){
            return 7;
        }else if(nextOperand.equalsIgnoreCase("1/x")){
            return 8;
        }else if(nextOperand.equalsIgnoreCase("+/-")){
            return 9;
        }else if(nextOperand.equalsIgnoreCase("sin")){
            return 10;
        }else if(nextOperand.equalsIgnoreCase("cos")){
            return 11;
        }else if(nextOperand.equalsIgnoreCase("tan")){
            return 12;
        }else if(nextOperand.equalsIgnoreCase("invSin")){
            return 13;
        }else if(nextOperand.equalsIgnoreCase("invCos")){
            return 14;
        }else if(nextOperand.equalsIgnoreCase("invTan")){
            return 15;
        }else if(nextOperand.equalsIgnoreCase("log")){
            return 16;
        }else if(nextOperand.equalsIgnoreCase("invLog")){
            return 17;
        }else if(nextOperand.equalsIgnoreCase("Ln")){
            return 18;
        }else if(nextOperand.equalsIgnoreCase("invLn")){
            return 19;
        }else if(nextOperand.equalsIgnoreCase("!")){
            return 20;
        }else if(nextOperand.equalsIgnoreCase("m+")){
            return 21;
        }else if(nextOperand.equalsIgnoreCase("mc")){
            return 22;
        }else if(nextOperand.equalsIgnoreCase("mrc")){
            return 23;
        }else if(nextOperand.equalsIgnoreCase("mode")){
            return 24;
        }else if(nextOperand.equalsIgnoreCase("mode x")){
            return 25;
        }else if(nextOperand.equalsIgnoreCase("rd")){
            return 26;
        }else if(nextOperand.equalsIgnoreCase("rd x")){
            return 27;
        }else if(nextOperand.equalsIgnoreCase("prime")){
            return 28;
        }else if(nextOperand.equalsIgnoreCase("year%")){
            return 29;
        }else if(nextOperand.equalsIgnoreCase("c")){
            return 0;
        }else if(nextOperand.equalsIgnoreCase("off")){
            return 100;
        }else{
            if(Display.error) System.out.println("Please clear before continuing!");
            return getOperand(prompt);
        }
    }
}



