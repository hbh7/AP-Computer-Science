package Projects;

import java.util.Scanner;

public class proj4_2 {
    public static void main (String [] args) {

        /*
        Write a program that takes the lengths of three sides of a triangle as inputs. The program
        should display whether or not the triangle is a right triangle.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the first side of a triangle: ");
        double side1 = scanner.nextDouble();

        System.out.print("Please provide the second side of a triangle: ");
        double side2 = scanner.nextDouble();

        System.out.print("Please provide the third side of a triangle: ");
        double side3 = scanner.nextDouble();

        if(Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
            System.out.println("This is a right triangle");
        } else if(Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)) {
            System.out.println("This is a right triangle");
        } else if(Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2)) {
            System.out.println("This is a right triangle");
        }

    }

}
