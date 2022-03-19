package com.company;

class Bank {
   static float getInterestRate () {return 8.0F;}
}

class SBI extends Bank {
    static float getInterestRate () {return 3.0F;}
}

class ICICI extends Bank {
   static float getInterestRate () {return 9.0F;}
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println(ICICI.getInterestRate());
        System.out.println(SBI.getInterestRate());
    }
}

