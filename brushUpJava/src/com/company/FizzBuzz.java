package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // / by 5 - FIZZ, / 3 - BUZZ , / both 5 and 3 - FIZZ BUZZ and if not / by either, return the number!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:\t");
        byte number = scanner.nextByte();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
