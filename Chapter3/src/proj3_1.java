import java.util.Scanner;

public class proj3_1 {
    public static void main (String [] args) {

        // The surface area of a cube can be known if we know the length of an edge. Write a program that takes the
        // length of an edge (an integer) as input and prints the cube's surface area as output.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hey there, please give me an edge of a cube! ");

        double edge = scanner.nextDouble();

        double surfaceArea = edge * edge * 6;

        System.out.println("Welp! Your cube has a surface area of " + surfaceArea + "! :D");

    }

}
