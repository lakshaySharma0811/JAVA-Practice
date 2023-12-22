package Entities;

public class School extends Bank {

    School() {
        super("Harsh", 1000, 500, 512);
    }

    public static void main(String[] args) {
        School sc = new School();

        // sc.setPassword(123);
        // System.out.println(sc.getPassword());
        System.out.println(sc.customerName);
        sc.printInfo();
        System.out.println(sc.customerName);

    }

}
