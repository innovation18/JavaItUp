package com.company;

import java.util.Scanner;

abstract class Employer {
    static final String employerName = "NatWest";

    static void test () {
        System.out.println("Testing!");
    }

    abstract void anotherTest();
}



class Employee extends Employer {

    static int noOfEmployees=0;
    String name;

    Employee(String name) {
        noOfEmployees++;
        this.name = name;
    }

    void employeeWorks() {
        System.out.println("Here I work!");
    }

    void anotherTest() {
        System.out.println("TestingTesting!");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Name:\t");
        String firstName = scan.next();
        System.out.print("Enter Last Name:\t");
        String lastName = scan.next();
        Employee employee1 = new Employee(firstName + " " + lastName);
        System.out.println(employee1.name);
        System.out.println("No. Of Employees:\t" + employee1.noOfEmployees);
        System.out.println(employerName);
        test();
        employee1.anotherTest();

        Employee employee2 = new Employee("Jeff" + " " + "Buckley");
        System.out.println(employee2.name);
        System.out.println("No. Of Employees:\t" + employee2.noOfEmployees);
        System.out.println(employerName);
        test();
        employee2.anotherTest();
    }
}