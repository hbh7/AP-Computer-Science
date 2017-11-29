package Projects;

import java.util.Scanner;

public class proj4_7 {
    public static void main (String [] args) {

        /*
        Computers use the binary system, which is based on powers of 2. Write a program that displays
        the positive powers of 2. When the user enters the exponent at a prompt, the program displays
        2 to that power. The program halts when the user enters –1.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("2 to the power of what? ");
            int power = scanner.nextInt();

            if(power == -1)
                break;
            System.out.println((int) Math.pow(2,power));
        }

    }

}
