package IOProjects;

import java.util.Scanner;

public class DistanceAndTimeToRate {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How far did you go (in meters)? ");
        double meters = scanner.nextDouble();

        System.out.print("How long did it take (hours)? ");
        double hours = scanner.nextDouble();

        System.out.print("How long did it take (minutes)? ");
        double minutes = scanner.nextDouble();

        System.out.print("How long did it take (seconds)? ");
        double seconds = scanner.nextDouble();

        double metersPerSecond = (meters / ((hours*60*60) + (minutes*60) + seconds));
        double kilometersPerHour = ((meters/1000) / ((hours + (minutes/60) + (seconds/60/60) )));
        double milesPerHour = ((meters/1609) / ((hours + (minutes/60) + (seconds/60/60) )));

        System.out.println("Your average speed is " + metersPerSecond + " meters per second.");
        System.out.println("Your average speed is " + kilometersPerHour + " kilometers per hour.");
        System.out.println("Your average speed is " + milesPerHour + " miles per hour.");
    }
}
