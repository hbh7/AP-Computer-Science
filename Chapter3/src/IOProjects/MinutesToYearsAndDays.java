package IOProjects;

import java.util.Scanner;

public class MinutesToYearsAndDays {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many minutes? ");
        int minutes = scanner.nextInt();
        int days = minutes / 60/24;
        int years = days/365;
        days = days-(365*years);

        System.out.println("You have " + years + " years and " + days + " days.");
    }
}
