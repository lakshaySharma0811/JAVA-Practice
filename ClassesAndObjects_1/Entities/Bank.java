package Entities;

public class Bank {
    public String customerName;
    public int deposit;
    public int withdraw;
    private int password = 125;

    // Constructor -> Used to initialize the objects. By default, it is
    // non-parameterized created by system itself.

    // =============/Non- parameterized Constructor/===================
    // public Bank() {
    // System.out.println("Constructor called here");
    // }

    // ===============/ Parameterized Constructor/======================
    public Bank(String customerName, int deposit, int withdraw, int password) {
        this.customerName = customerName;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.password = password;
    }

    // ================/Copy Constructor/=================
    // public Bank(Bank p2){
    // this.customerName = p2.customerName;
    // }

    public void printInfo() {
        this.customerName = "lakshay";
        // System.out.println(super.customerName);
    }

    public int calculateBalance() {
        return this.deposit - this.withdraw;
    }

    // Getter
    public int getPassword() {
        return password;
    }

    // Setter
    public void setPassword(int newPassword) {
        this.password = newPassword;
    }

}
