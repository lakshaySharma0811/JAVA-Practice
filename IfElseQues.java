import java.util.Scanner;

public class IfElseQues {
    public static void main(String[] args) {

        // 1. Write a Java program to get a number from the user and print whether it is
        // positive or negative.
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        if ((num) * (-1) == num) {
            System.out.println("negative");
        } else if ((num) * (-1) == -num) {
            System.out.println("positive");
        } else {
            System.out.println("neither positive nor negative");
        }
        sc.close();
    }
}
