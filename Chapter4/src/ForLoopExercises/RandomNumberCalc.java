package ForLoopExercises;

import java.util.Random;

public class RandomNumberCalc {
    public static void main (String [] args) {

       /*
       Write a program that will use a for loop to output 10 random numbers from 0 to 100
        */

       Random random = new Random();

        for(int x = 1; x <= 10; x++) {
            System.out.println(random.nextInt(100));
        }

    }

}
