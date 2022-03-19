package com.company;

//interface assumes all the methods are abstract and hence we can not implement a method inside an interface *****NOT TRUE******** WE CAN!!!!
//Abstract class in java can have implemented methods and ones that are not implemented.


import java.util.Scanner;

interface HumanInterface {
    static void walk() {
        System.out.println("Let's walk!");
    }

    void dance();
    //   void bake() {}                    ------->                    Interface abstract methods can not have body

    static void bake() {
        System.out.println("Hello There! I am a non-abstract method inside an Interface!");
    }
}

abstract class HumanAbstract {
    String name = null;

    abstract void talk();

    void hear() {
        System.out.println("What was it you said!");
    }
}

class Abstract extends HumanAbstract implements HumanInterface {
    void talk() {
        System.out.println("Let's Talk!");
    }

    public void dance() {
        System.out.println("Let's dance!");
    }

}

class AbstractTutorial {
    public static void main(String[] args) {

        //HumanAbstract human = new HumanAbstract(); An Abstract class can not be initiated!
        Abstract human = new Abstract();

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name:\t");
        human.name = scan.next();

        System.out.println("Welcome " + human.name);
        human.talk();
        human.hear();
        HumanInterface.walk();
        human.dance();


    }

}
