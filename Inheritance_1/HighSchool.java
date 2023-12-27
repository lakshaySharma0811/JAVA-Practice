public class HighSchool extends PlaySchool {

    // HighSchool() {
    // super("Lakshay", "Delhi", 20, 12);
    // }

    HighSchool() {
        super.studentName = "Lakshay";
    }

    void getDetails() {
        System.out.println(this.studentName + ", " + this.address + ", " + this.age + ", " + this.standard);
        System.out.println(super.studentName + ", " + super.address + ", " + super.age + ", " + super.standard);
    }

    public static void main(String[] args) {
        HighSchool ss = new HighSchool();
        ss.studentName = "Harsh";
        ss.getDetails();
    }
}
