// Polymorphism -> Different methods with same name in one class.

// Types of polymorphism:-
// 1. Compile time polymorphism -> It detects the error during the compilation.
// 2. Run time polymorphism -> It detects the error during running the code.

public class Student {
    String name;
    int standard;
    double percentage;

    Student(String name, int standard, double percentage) {
        this.name = name;
        this.standard = standard;
        this.percentage = percentage;
    }

    // Rules(Or Differentiating factors) for making methods:-
    // 1. different data types
    // 2. different number of arguments
    // 3. if same number of arguments, their data types should be different

    void studentData() {
        System.out.println(name);
    }

    void studentData(int standard) {
        System.out.println(standard);
    }

    double studentData(double percentage) {
        return percentage;
    }

    void studentData(String name, int standard) {
        System.out.println("Name: " + name + ", Standard: " + standard);
    }

}
