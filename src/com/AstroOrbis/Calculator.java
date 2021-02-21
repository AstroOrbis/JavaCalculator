package com.AstroOrbis;

import java.util.*;
import java.io.*;

public class Calculator {
    private static String CalcTypeReadable;

    public static void main(String[] args)
            throws IOException
    {
        //ask question
        System.out.println("Would you like to add, substract, divide or multiply? Enter '+', '-', '/', or '*' respectively.");

        // Start the input stream thingy idk
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading user response using readLine
        String CalcType = reader.readLine();

        //Making CalcType readable, and printing the readable version to console
        switch (CalcType) {
            case "+": {
                String CalcTypeReadable = "Addition";
                System.out.println("You chose: Addition");
                break;
            }
            case "-": {
                String CalcTypeReadable = "Substraction";
                System.out.println("You chose: Substraction");
                break;
            }
            case "/": {
                String CalcTypeReadable = "Division";
                System.out.println("You chose: Division");
                break;
            }
            case "*": {
                String CalcTypeReadable = "Multiplication";
                System.out.println("You chose: Multiplication");
                break;
            }
            default:
                System.out.println("This is a bug, please report it in the Issues tab!");
                break;
        }


    }
}


