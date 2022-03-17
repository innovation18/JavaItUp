package com.company;

import java.security.Principal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;             //CONSTANTS
        final byte PERCENTAGE = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 100;

        while (true) {
            System.out.print("Principal ($1K - $1M):\t");
            principal = scanner.nextInt();
            if (principal > 1000 && principal < 1_000_000)
                break;
            else
                System.out.println("Enter a number between 1,000 and 1,000,000.");
            continue;
        }

        float annualInterest = 5;

        while (true) {
            System.out.print("Annual Interest Rate:\t");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest < 10)
                break;
            else
                System.out.println("Annual Interest should be less than 10.");
            continue;
        }

        float monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;

        byte totalYears = 15;

        while (true) {
            System.out.print("Period (Years):\t");
            totalYears = scanner.nextByte();

            if (totalYears > 0 && totalYears < 20)
                break;
            else
                System.out.println("Loan tenure should be less than 20.");
            continue;
        }

        int numberOfPayments = totalYears * MONTHS_IN_YEAR;

        double equation = Math.pow((1 + monthlyInterest), numberOfPayments);

        double mortgage = principal * monthlyInterest * equation / (equation - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String value = currency.format(mortgage);
        System.out.println("Mortgage:\t" + value);
    }
}
