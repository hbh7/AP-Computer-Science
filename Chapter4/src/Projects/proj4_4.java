package Projects;

import java.util.Scanner;

public class proj4_4 {
    public static void main (String [] args) {

        /*
        Run the Factorial program of Section 4.5 with inputs of 5, 10, and 20. Notice that the
        number for the last output is large but negative. Place an output statement in the loop so that you
        can view the value of count and number on each pass. Can you explain what the problem is?
        Now change the type of product from int to long, recompile the program, and run it again
        with the same inputs. Explain what happens. How large does the input have to be before you
        encounter the same problem again?
         */

        /* Needs to be 21 */

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number greater than 0: ");
        int number = reader.nextInt();
        long product = 1;
        int count = 1;
        while (count <= number){
               product = product * count;
               System.out.println(product);
               count++;
            }
        System.out.println("The factorial of " + number + " is " + product);

    }

}
