import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String [] args) {

        /*
        Write a program that will ask the user to enter a number. The program will then output the multiplication
        table for that number from 1 to 10. Format the output so that it looks like
        3 * 1 = 3
        3 * 2 = 6 (where 3 is the number the user enters and result is correct for that number)
        3 * 3 = 9
        ...
        3 * 10 = 30
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        int count = 1;

        while(count < 11){
            System.out.println(number + " * " + count + " = " + (number * count));
            count++;
        }

    }

}
