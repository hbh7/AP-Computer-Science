package MathClassExercises;

import java.util.Scanner;

public class DoublenputMath {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter another number: ");
        double y = scanner.nextDouble();
        System.out.println("Math.max(x,y) = " + Math.max(x,y));
        System.out.println("Math.min(x,y) = " + Math.min(x,y));
        System.out.println("Math.pow(x,y) = " + Math.pow(x,y));

    }
}
