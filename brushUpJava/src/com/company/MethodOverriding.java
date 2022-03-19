package com.company;

class Bank {
   float getInterestRate () {return 8.0F;}
}

class SBI extends Bank {
   float getInterestRate () {return 3.0F;}
}

class ICICI extends Bank {
   float getInterestRate () {return 9;}
}

public class MethodOverriding {
    public static void main(String[] args) {
    //    System.out.println(SBI.getInterestRate()); //Instance method 'getInterestRate()' in 'com.company.SBI' cannot override static method 'getInterestRate()' in 'com.company.Bank'
        Bank sbi;

        sbi = new SBI();

        System.out.println(sbi.getInterestRate());

    }
}

