package com.company;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Primitive Type Example - For storing simple values
        System.out.println("Primitive Type Example - For storing simple values \n");
        byte a = 1;
        byte b = a;
        a = 2;
        System.out.println("Value of b:\t" + b);

        // Primitive Variables a and b are stored in different memory locations completely independent of each other.
        // Change in value of a won't affect the value of b.

        // Memory is allocated and release automatically by JRE


        // Reference Type Example - For storing complex objects
        System.out.println("\nPrimitive Type Example - For storing complex objects \n");

        Point point1 = new Point(2,7); // 'new' operator is used as means of allocating memory to reference variable.
        // JRE upon its execution allocates some memory to this Point object.
        // Reference Variable point1 will have a separate memory location storing the address of the Point object

        Point point2 = point1; // Reference Variable point2 will end up storing Point Object address as does point1,
        // Meaning point1 and point 2 will always have same output for the reference is to Point Object.

        point2.y = 10;
        System.out.println(point1.getY());


        // String
        System.out.println("\nString Examples \n");

        String message = "Hello You   ";
        message.toLowerCase();
        System.out.println(message); // Confirming that String is immutable

        System.out.println("Does it start with 'H'?\t" + message.startsWith("H"));
        // H as an argument here in this example will be double quotes denoting message as String and not a Character.

        System.out.println(message.trim());



        // Arrays - One Dimensional Array
        System.out.println("\nOne Dimensional Array \n");

        // Old Implementation
        int[] numbers = new int[8]; // Instantiating numbers array as "Arrays are Reference Types".
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));

        // New Implementation - Given Items are known already - Fixed Length!!!
        int[] numbers1 = { 2, 4, 5, 3, 1 };
        System.out.println(Arrays.toString(numbers1));


        // Arrays - Multi Dimensional Array
        System.out.println("\nMulti Dimensional Array \n");

        int[][] matrix = new int[2][3];
        matrix[0][1] = 5;
        System.out.println(Arrays.deepToString(matrix));

        //Another Implementation
        int[][] matrix1 = { {1,2,3,5}, {4,7,2,5} };
        System.out.println(Arrays.deepToString(matrix1));

        // Arithmetic Examples
        System.out.println("\nArithmetic Examples\n");
        int x = 1;
        int y = ++x;

        int x1 = 1;
        int y1 = x1++;

        System.out.println("x is:\t" + x + "\ny is:\t" + y + "\nx1 is:\t" + x1 + "\ny1 is:\t" + y1);

        //Augmented Assignment Operator Example
        int x2 = 1;
        //x2 /= 2;
        x2 =+ 4;

        System.out.println("\nx2 is:\t" + x2);

        //Implicit Casting
        //Whenever the value can be converted to a bigger data type, casting happens automatically.
        // byte > short> int > long > float > double
        System.out.println("\nImplicit Casting\n");

        short a1 = 1;
        int b1 = a1 + 1;

        System.out.println("a1 is:\t" + a1 + "\nb1 is:\t" + b1);

        //Explicit Casting
        System.out.println("\nExplicit Casting\n");

        double a3 = 1.2;
        int b3 = (int) (a3 + 5);
        int c3 = (int) a3 + 5;
        System.out.println("a3 is:\t" + a3 + "\nb3 is:\t" + b3);

        //Casting String to Integer
        System.out.println("\n String to Integer Casting\n");

        String a4 = "1";
        int b4 = Integer.parseInt(a4) + 5;
        System.out.println("a4 is:\t" + a4 + "\nb4 is:\t" + b4);


        //Math - Random Examples
        System.out.println("\nMath Examples\n");

        double a5 = Math.random() * 100;
        System.out.println("a5 is:\t" + a5);

        double a6 = Math.round(Math.random() * 100);
        System.out.println("a6 is:\t" + a6);

        int a7 = (int) Math.round(Math.random() * 100);
        System.out.println("a7 is:\t" + a7);

        int a8 = (int) Math.random() * 100; //Always 0
        System.out.println("a8 is:\t" + a8);

        int a9 = (int) (Math.random() * 100);
        System.out.println("a9 is:\t" + a9);


        //Number Format - Can not be instantiated as it is an abstract class
        System.out.println("\nNumber Formatting Examples\n");

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String price = currency.format(123423.345);
        System.out.println("price is:\t" + price);

        String price1 = NumberFormat.getCurrencyInstance().format(123_243_2.54); //Method Chaining
        System.out.println("price1 is:\t" + price1);


        //User Input - Example
//        System.out.println("\nTaking user input\n");
//
//        System.out.print("Name:\t");        //print method keeps it in the same line.
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine().trim();
//        System.out.println("Your Name is:\t" + name);

        //Control Flow

        boolean hasHighSalary = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighSalary || hasGoodCredit) && hasCriminalRecord;
        System.out.println(isEligible);

        System.out.print("Temperature:\t");
//        byte temperature = scanner.nextByte();
        byte temperature = 5;
        if (temperature > 30)
            System.out.println("It's a hot day!");
        else if (temperature > 20)
            System.out.println("It's a nice day!");
        else
            System.out.println("It's Cold!");

        int income = 120_000;

        boolean hasHighIncome = (income > 100_000);

        String className = hasHighIncome ? "First Class" : "Economy Class";

        System.out.println("Individual has " + (hasHighIncome ? "high income" :
                "less income") + " and belongs to " + className);

        String role = "admin";
        while (true) {
            System.out.println("Hey There!");
            if (role.equals("admin"))
                break;
        }

        do {
            System.out.println("Hey Buddy!");
        } while (!role.equals("admin"));


        switch (role) {
            case "admin":
                System.out.println("You're an admin!");
                break;

            case "client":
                System.out.println("You're the client!");
                break;

            case "default":
                System.out.println("Hello Stranger!");
                break;
        }

        for (int i = 0; i < 5; i++)
            System.out.println("Hey! " + i);

        int i = 5;
        while (i > 0) {
            System.out.println("Hey! " + i);
            i--;
        }


    }
}
