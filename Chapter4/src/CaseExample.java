import java.util.Objects;
import java.util.Scanner;

public class CaseExample {
    public static void main (String [] args) {

       /*
       Write a program that will use a while loop to output the numbers 1 to 20
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Say something? ");
        String test = scanner.next();


        while(!Objects.equals(test, "quit")) {
            System.out.print("Say something else? ");
            test = scanner.next();
        }

    }

}
