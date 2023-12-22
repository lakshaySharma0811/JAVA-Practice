package Entities;

public class Human {
    public String name;
    public int age;
    private boolean isSleeping;
    boolean isRunning; // Default

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void sleep() {
        this.isSleeping = true;
    }

    public void run() {
        this.isRunning = true;
    }

    public boolean isRunningOrNot() {
        if (this.isRunning) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSleepingOrNot() {
        if (this.isSleeping) {
            return true;
        } else {
            return false;
        }
    }

    // Default -> Access at same or package level.
    // Public -> Access at any level.
    // Private -> Access at only in the same class. We use getters and setters to
    // access in other classes.
    // Protected -> Access at same or package level or can be access anywhere by
    // inheritance.
}
