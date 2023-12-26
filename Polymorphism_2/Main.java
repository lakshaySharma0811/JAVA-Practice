public class Main {

    public static void main(String[] args) {
        Customer cs = new Customer();
        cs.bankDetails("Lakshay", 20, 123456);
        cs.setPin(456);
        cs.getPin();
    }
}