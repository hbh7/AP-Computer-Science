package IOProjects;

import java.util.Scanner;

public class TwoIntToMath {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide a number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please provide another number: ");
        double num2 = scanner.nextDouble();

        System.out.println("The sum is " + (num1 + num2) + ".");
        System.out.println("The difference is " + (num1 - num2) + ".");
        System.out.println("The product is " + (num1 * num2) + ".");
        System.out.println("The average is " + ((num1 + num2)/2) + ".");
        System.out.println("The distance is " + (Math.abs(num1-num2)) + ".");
        System.out.println("The maximum is " + (Math.max(num1, num2)) + ".");
        System.out.println("The minimum is " + (Math.min(num1, num2)) + ".");
    }
}
