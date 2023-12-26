public class Bank {
    String name;
    int age;
    protected int accountNo;
    private int accountPin = 123;

    // Getter
    void getPin() {
        System.out.println(this.accountPin);
    }

    // Setter
    void setPin(int newPin) {
        this.accountPin = newPin;
    }
}
