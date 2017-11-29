package ForLoopExercises;

import java.util.Random;
import java.util.Scanner;

public class AverageComputer {
    public static void main (String [] args) {

       /*
       Write a program that will ask the user for how many numbers do they want to average. It will then use a for
       loop to ask the user the appropriate number of numbers. After the for loop it will output the average.
        */

        Scanner scanner = new Scanner(System.in);
        int average = 0, count;

        System.out.print("Please enter the total number of numbers to average: ");
        count = scanner.nextInt();

        for(int x = 1; x <= count; x++) {
            System.out.print("Please enter a number: ");
            average = average + scanner.nextInt();
        }

        average = average/count;
        System.out.println("The average is " + average);

    }

}
