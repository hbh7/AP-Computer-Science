import java.util.Scanner;

public class proj3_5 {
    public static void main (String [] args) {

        /*
        Modify the program you created in Project 3-4 so that it prompts the user for the regular and overtime
        hours of each of five working days.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your hourly wage? ");
        double hourlyWage = scanner.nextDouble();

        String Days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        double hoursPerDay[] = new double[5];
        double overtimePerDay[] = new double[5];
        double payPerDay[] = new double[5];

        for (int i = 0; i<5; i++) {
            System.out.print("How much did you work " + Days[i] + "? ");
            hoursPerDay[i] = scanner.nextInt();
            System.out.print("Overtime? ");
            overtimePerDay[i] = scanner.nextInt();

            payPerDay[i] = (hoursPerDay[i] * hourlyWage) + (1.5 * overtimePerDay[i] * hourlyWage);
        }

        double paycheck = 0;

        for (int i = 0; i<5; i++) {
            paycheck = paycheck + payPerDay[i];
        }

        System.out.println("Your total paycheck is " + paycheck + ". Good job!");

    }
}
