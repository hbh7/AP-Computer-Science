package Projects;

import java.util.Scanner;

public class proj4_3 {
    public static void main (String [] args) {

        /*
        A 2-minute telephone call to Lexington, Virginia, costs $1.15. Each additional minute costs
        $0.50. Write a program that takes the total length of a call in minutes as input and calculates and
        displays the cost.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide your call's length in whole minutes: ");
        int callLength = scanner.nextInt();

        if(callLength > 2) {
            System.out.println("Your call bill is $" + (1.15 + 0.5*(callLength-2)));
        } else {
            System.out.println("Your call bill is $1.15");
        }
    }

}
