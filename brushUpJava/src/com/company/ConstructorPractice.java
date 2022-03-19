package com.company;


import java.util.Scanner;

class letsPracticeConstructors {
    int connectionId;
    int customerId;
    int facilityId;
    String legalEntity;
    String sourceSystem;

    letsPracticeConstructors(int connectionId, int customerId, int facilityId, String sourceSystem) {
        this.connectionId = connectionId;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.sourceSystem = sourceSystem;
    }

    letsPracticeConstructors(int connectionId, int customerId, int facilityId, String sourceSystem, String legalEntity) {
        this(connectionId, customerId, facilityId, sourceSystem);
        this.legalEntity = legalEntity;
    }

    void connectionData() {
        System.out.println("Connection ID:\t" + this.connectionId + "\n" +
                "Customer ID:\t" + this.customerId + "\n" +
                "Facility ID:\t" + this.facilityId + "\n" +
                "Source System:\t" + this.sourceSystem  + "\n" +
                "Legal Entity:\t" + this.legalEntity);
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Connection ID:\t");
        int connectionId = scan.nextInt();

        System.out.print("Enter Customer ID:\t");
        int customerId = scan.nextInt();

        System.out.print("Enter Facility ID:\t");
        int facilityId = scan.nextInt();

        System.out.print("Enter Source System:\t");
        String sourceSystem = scan.next();

        System.out.print("Enter Legal Entity:\t");
        String legalEntity = scan.next();

        letsPracticeConstructors connection1 = new letsPracticeConstructors(connectionId, customerId, facilityId, sourceSystem, legalEntity);

        connection1.connectionData();

    }
}
