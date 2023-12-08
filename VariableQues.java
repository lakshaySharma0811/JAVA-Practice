import java.util.Scanner;

public class VariableQues {
    public static void main(String[] args) {
        // 1. Write a Java program to convert temperature from Fahrenheit to Celsius
        // degrees. C = (F - 32) * 5/9
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Temp in Fahrenheit: ");
        // int tempInFahrenheit = sc.nextInt();
        // double tempInCelsius = (tempInFahrenheit - 32) * 5 / 9;
        // System.out.println("Temp in Celsius: " + tempInCelsius);
        // sc.close();

        
        // 2. Write a Java program that reads a number in inches and converts it to
        // meters. (Note: One inch is 0.0254 meter)
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Number in inches: ");
        // double inches = sc.nextInt();
        // double meters = 0.0254 * inches;
        // System.out.println("Number in meters: " + meters);
        // sc.close();

        
        // 3. Write a Java program that reads an integer between 0 and 1000 and adds all
        // the digits in the integer.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int firstDigit = num % 10;
        // int remainingNum = num / 10;
        // int secondDigit = remainingNum % 10;
        // remainingNum = remainingNum / 10;
        // int thirdDigit = remainingNum % 10;

        // int sum = firstDigit + secondDigit + thirdDigit;
        // System.out.println("Sum of all the digits: " + sum);

        // sc.close();

        
        // 4. Write a Java program to convert minutes into years and days.
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of minutes: ");
        double mins = sc.nextDouble();
        double yrs = mins / (365 * 24 * 60);
        double days = mins / (24 * 60);

        System.out.println(mins + " minutes is approximately " + yrs + " years and " + days + " days.");

        sc.close();

    }
}
