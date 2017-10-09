import java.util.Scanner;

public class proj3_3 {
    public static void main (String [] args) {

        // The kinetic energy of a moving object is given by the formula KE=(1/2)mv2,
        // where m is the object's mass and v is its velocity. Modify the program you
        // created in Chapter 2, Project 2-5, so that it prints the object's kinetic
        // energy as well as its momentum.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello! Please input an object's mass in kilograms! ");
        double mass = scanner.nextDouble();

        System.out.print("Great! Now, please input the object's velocity in meters per second! ");
        double velocity = scanner.nextDouble();

        double momentum = mass*velocity;
        double kineticEnergy = .5 * mass * Math.pow(velocity, 2);

        System.out.println( "Cool! Your object's momentum is " + momentum + "!");
        System.out.println( "Cool! Your object's kinetic energy is " + kineticEnergy + "!");

    }

}
