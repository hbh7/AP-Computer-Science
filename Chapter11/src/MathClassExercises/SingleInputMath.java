package MathClassExercises;

import java.util.Scanner;

public class SingleInputMath {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double x = scanner.nextDouble();
        System.out.println("Math.abs(x) = " + Math.abs(x));
        System.out.println("Math.ceil(x) = " + Math.ceil(x));
        System.out.println("Math.floor(x) = " + Math.floor(x));
        System.out.println("Math.sqrt(x) = " + Math.sqrt(x));
    }
}
