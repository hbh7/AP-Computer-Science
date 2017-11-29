package Projects;

import java.util.Scanner;

public class proj4_8 {
    public static void main (String [] args) {

        /*
        Modify the program of Project 4-7 so that the user can specify the base (2 or higher) as well.
        The first line of the output should display which base was entered.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("What base? ");
            int base = scanner.nextInt();

            System.out.print(base + " to the power of what? ");
            int power = scanner.nextInt();

            if(power == -1 || base == -1)
                break;
            System.out.println(base + " to the power of " + power + " is " + (int) Math.pow(base,power));
        }


    }

}
