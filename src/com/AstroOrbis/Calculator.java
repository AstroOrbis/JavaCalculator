package com.AstroOrbis;

import java.io.*;
import java.util.*;


public class Calculator {
    public static void main(String[] args)

        Scanner scanner = new Scanner (System.in); // create scanner
        System.out.println("Would you like to add, substract, divide or multiply?");       // prompt user
        String CalculationType = scanner.next();                     // get user input

        System.out.println("You chose:" + CalculationType)


    }
}
