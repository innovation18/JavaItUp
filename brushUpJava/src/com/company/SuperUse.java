package com.company;

import java.util.Scanner;

class LegalEntity {
    protected int connectionId;
    protected String legalEntity;
    protected String superKeyword = "Parent Variable";

    LegalEntity (int connectionId, String legalEntity) {
        this.connectionId = connectionId;
        this.legalEntity = legalEntity;
    }

    String returnLegalEntity() {
       return this.legalEntity;
    }

}

class Connection extends LegalEntity {

    int customerId;
    int facilityId;
    String sourceSystem;
    String superKeyword = "Child Variable";

    Connection (int connectionId, int customerId, int facilityId, String sourceSystem, String legalEntity) {
        super(connectionId, legalEntity);

        this.customerId = customerId;
        this.facilityId = facilityId;
        this.sourceSystem = sourceSystem;
    }

    void connectionData() {
        System.out.println(
                "Connection ID:\t" + this.connectionId + "\n" +
                "Customer ID:\t" + this.customerId + "\n" +
                "Facility ID:\t" + this.facilityId + "\n" +
                "Source System:\t" + this.sourceSystem + "\n" +
                "Legal Entity:\t" + returnLegalEntity()
        );

        System.out.println("This is:\t" + superKeyword);

        System.out.println("This is:\t" + super.superKeyword);
    }

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

        Connection connection = new Connection(connectionId, customerId, facilityId, sourceSystem, legalEntity);

        connection.connectionData();
    }
}