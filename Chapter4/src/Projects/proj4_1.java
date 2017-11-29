package Projects;

import java.util.Scanner;

public class proj4_1 {
    public static void main (String [] args) {

        /*
        When you first learned to divide, you expressed answers using a quotient and a remainder
        rather than a fraction or decimal quotient. For example, if you divided 9 by 2, you gave the
        answer as 4 r. 1. Write a program that takes two integers as inputs and displays their quotient and
        remainder as outputs. Do not assume that the integers are entered in any order, but be sure to
        divide the larger integer by the smaller integer.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide a number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please provide a second number: ");
        double num2 = scanner.nextDouble();

        if(num1 > num2) {
            System.out.println("Your total is " + (int) (num1/num2) + " remainder " + (int) (num1%num2));
        } else {
            System.out.println("Your total is " + (int) (num2/num1) + " remainder " + (int) (num2%num1));
        }

    }

}
