package com.company;

// []                               ------> "No one likes this"
// [P1]                             ------> "P1 likes this"
// [P1, P2]                         ------> "P1 and P2 likes this"
// [P1, P2, P3]                     ------> "P1, P2 and P3 likes this"
// [P1, P2, P3, P4]                 ------> "P1, P2 and 2 others likes this"


//["Chicky", "Ricky", "Picky", "Dicky", "Nicky"]
//["Chicky","Ricky","Picky","Dicky"]
//["Chicky","Ricky","Picky"]
//["Chicky","Ricky"]
//["Chicky"]
//[]



import java.util.Scanner;

public class Solution {

    static String result = "No one likes this";

    public static void whoLikesIt(String[] names){

        //for(String name: names) {System.out.println(name);}

        if (names[0] == "")
            System.out.println(result);
        else if (names.length == 1)
            System.out.println(names[0] + " likes this");
        else if (names.length == 2)
            System.out.println(names[0] + " and " + names[1] +  " likes this");
        else if (names.length == 3)
            System.out.println(names[0] + ", " + names[1]  + " and "  + names[2] + " likes this");
        else if (names.length >= 4)
            System.out.println(names[0] + ", " + names[1]  + " and " + (names.length - 2) + " others likes this");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String inputNames = scan.nextLine();
        String[] names = inputNames.replaceAll("\\[", "").
                replaceAll("\\]","").replaceAll("\"","").split(", ");

        whoLikesIt(names);

    }
}
