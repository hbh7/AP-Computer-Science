package ForLoopProjects;

import java.util.Scanner;

public class MeaningOfLife {
    public static void main (String [] args) {

        /*
         * Write a program that asks you the meaning of life over and over and over again until you type 42.
         */

        Scanner scanner = new Scanner(System.in);

        boolean yes = false;
        while(!yes) {
            System.out.println("What is the meaning of life?");
            if(scanner.next().equals("42")) {
                System.out.println("I firmly agree");
                yes = true;
            }
        }

    }

}
