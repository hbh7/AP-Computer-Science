import java.util.Scanner;

public class proj3_2 {
    public static void main (String [] args) {

        // Write a program that takes the radius of a sphere (a double) as input and outputs the sphere's diameter,
        // circumference, surface area, and volume.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey there, please give me the radius of a sphere! ");
        double radius = scanner.nextDouble();
        scanner.close();

        double diameter      = radius * 2;
        double circumference = Math.PI * diameter;
        double surfaceArea   = 4 * Math.PI * Math.pow(radius, 2);
        double volume        = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Your cube has a diameter of %f!\n", diameter);
        System.out.printf("Your cube has a circumference of %f!\n", circumference);
        System.out.printf("Your cube has a surface area of %f!\n", surfaceArea);
        System.out.printf("Your cube has a volume of %f!\n", volume);
        System.out.println("Enjoy! :D");


    }

}
