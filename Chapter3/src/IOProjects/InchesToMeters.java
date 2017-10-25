package IOProjects;

import java.util.Scanner;

public class InchesToMeters {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many inches? ");
        double inches = scanner.nextDouble();

        System.out.println("You have " + (inches * 0.0254) + " meters.");
    }
}
