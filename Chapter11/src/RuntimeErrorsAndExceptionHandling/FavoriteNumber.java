package RuntimeErrorsAndExceptionHandling;

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Hi there! Please enter your favorite number! ");
            double favNum = scanner.nextDouble();
            System.out.println("Your number is beautiful!");
        } catch (Exception e) {
            System.out.println("Sorry, that didn't work. Rekt.");
            System.out.println("Your error was " + e);
        }

    }
}
