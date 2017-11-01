import java.util.Scanner;

public class proj3_4 {
    public static void main (String [] args) {

        // An employee's total weekly pay equals the hourly wage multiplied by the total number of regular hours plus
        // any overtime pay. Overtime pay equals the total overtime hours multiplied by 1.5 times the hourly wage.
        // Write a program that takes as inputs the hourly wage, total regular hours, and total overtime hours
        // and displays an employee's total weekly pay.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hey there, what's your hourly wage? ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("That's terrible gosh. How much did you work at least? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("You're a busy bee. Did you work overtime too? How much? ");
        double overtimeWorked = scanner.nextDouble();

        double paycheck = (hourlyWage * hoursWorked) + (1.5 * hourlyWage * overtimeWorked);

        System.out.println("Your total paycheck is " + paycheck + ". At least you made SOME money...");

    }

}
