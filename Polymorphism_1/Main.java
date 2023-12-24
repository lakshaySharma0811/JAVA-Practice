public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("lakshay", 10, 90.5);
        Student st2 = new Student("Harsh", 12, 95.5);

        st1.studentData();
        st2.studentData(5);
        System.out.println(st1.studentData(15.25));

    }
}