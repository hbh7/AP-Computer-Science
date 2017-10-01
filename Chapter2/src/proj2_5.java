import java.util.Scanner;

public class proj2_5 {

    public static void main(String[] args) {

        // An object’s momentum is its mass multiplied by its velocity.
        // Write a program that expects an object’s mass (in kilograms) and
        // velocity (in meters per second) as inputs and prints its momentum.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello! Please input an object's mass in kilograms! ");
        double mass = scanner.nextDouble();

        System.out.print("Great! Now, please input the object's velocity in meters per second! ");
        double velocity = scanner.nextDouble();
        scanner.close();

        double momentum = mass*velocity;

        System.out.printf("Cool! Your object's momentum is %f!\n", momentum);
    }
}
