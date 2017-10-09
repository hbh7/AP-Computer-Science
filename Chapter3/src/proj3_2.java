import java.util.Scanner;

public class proj3_2 {
    public static void main (String [] args) {

        // Write a program that takes the radius of a sphere (a double) as input and outputs the sphere's diameter,
        // circumference, surface area, and volume.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hey there, please give me the radius of a sphere! ");

        double radius = scanner.nextDouble();

        double diameter = radius * 2;
        double circumference = 2 * Math.PI * radius;
        double surfaceArea = 4 * Math.PI * (radius * radius);
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.println("Your cube has a diameter of " + diameter + "!");
        System.out.println("Your cube has a circumference of " + circumference + "!");
        System.out.println("Your cube has a surface area of " + surfaceArea + "!");
        System.out.println("Your cube has a volume of " + volume + "!");
        System.out.println("Enjoy! :D");


    }

}
