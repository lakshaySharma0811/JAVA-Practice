public class Customer extends Bank {

    public void bankDetails(String name) {
        System.out.println("Name: " + name);
    }

    public void bankDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void bankDetails(String name, int age, int accountNo) {
        System.out.println("Name: " + name + ", Age: " + age + ", Account No: " + accountNo);
    }

    public void bankDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Account No: " + accountNo);
    }

}
