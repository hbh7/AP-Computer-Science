package RuntimeErrorsAndExceptionHandling;

import java.util.Scanner;

public class NumberDivider {
    public static void main(String [] args) {
        System.out.println("Hi there! Please enter some numbers!");

        boolean valid = false;
        int maxTries = 10;
        int tries = 0;
        while (!valid) {
            double num1 = 0;
            double num2 = 0;
            try {
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Number One: ");
                num1 = scanner1.nextDouble();

                System.out.print("Number Two: ");
                num2 = scanner1.nextDouble();

                double num3 = num1 / num2;
                System.out.println(num3);
                if (Double.isInfinite(num3) || Double.isNaN(num3)) {
                    throw new ArithmeticException();
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("Sorry, that didn't work. Rekt.");
                System.out.println("Your error was " + e);
                valid = false;
                if(tries > maxTries)
                    throw e;
            }
            tries++;
        }
    }
}
