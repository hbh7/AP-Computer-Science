package ForLoopExercises;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberCalcDeluxe {
    public static void main (String [] args) {

        /*
        Modify the RandomNumberCalc program so that it asks the user for the number of random numbers desired and also
        the range.
        */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalNums = 0;
        int lowerRange = 0;
        int upperRange =0;

        try {
            System.out.print("Please enter the total number of random numbers: ");
            totalNums = scanner.nextInt();

            System.out.print("Please enter the lower range of numbers: ");
            lowerRange = scanner.nextInt();

            System.out.print("Please enter the upper range of numbers: ");
            upperRange = scanner.nextInt();
        } catch (Exception InputMismatchException) {
            System.out.println("You dun goofed.");
        }
        for(int x = 1; x <= totalNums; x++) {
            System.out.println((lowerRange-1) + random.nextInt(upperRange));
        }

    }

}
