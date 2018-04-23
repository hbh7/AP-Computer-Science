package RuntimeErrorsAndExceptionHandling;

import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = {152, 281, 307, 228, 186};

        try{
            System.out.print("Hi there! Please enter the index ID of a number in the array! ");
            int pos = scanner.nextInt();
            System.out.println("The number stored there is " + nums[pos]);
        } catch (Exception e) {
            System.out.println("Sorry, that didn't work. Rekt.");
            System.out.println("Your error was " + e);
        }

    }
}
