package IOProjects;

import java.util.Scanner;

public class NumberToExponents {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gimme a number: ");
        int number = scanner.nextInt();

        System.out.println(number + "^2 is " + (int)(Math.pow(number, 2)) + ".");
        System.out.println(number + "^3 is " + (int)(Math.pow(number, 3)) + ".");
        System.out.println(number + "^4 is " + (int)(Math.pow(number, 4)) + ".");
    }
}
