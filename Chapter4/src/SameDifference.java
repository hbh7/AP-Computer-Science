import java.util.Scanner;

public class SameDifference {
    public static void main (String [] args) {

        // Write a program that will ask the user to enter two numbers. use an if/else statement and the equality
        // operator ("==") to check if the numbers are the same. If they are, the program should output "These two
        // numbers are the same." If the numbers are different, the program should output "those numbers are different."

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number please: ");
        double num1 = scanner.nextDouble();

        System.out.print("Give me another number please: ");
        double num2 = scanner.nextDouble();

        if((num1 == 5.0 || num1 == 7.0) && (num2 == 5.0 || num2 == 7.0)) {
            System.out.println("These two numbers are identical! lol");
        } else if(num1 == num2) {
            System.out.println("These two numbers are identical! :D");
        } else {
            System.out.println("Bleh, these two numbers are not identical. :(");
        }

    }

}
