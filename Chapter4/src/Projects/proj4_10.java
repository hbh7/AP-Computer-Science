package Projects;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class proj4_10 {
    public static void main (String [] args) {

        /*
        Teachers in most school districts are paid on a schedule that provides a salary based on their
        number of years of teaching experience. For example, a beginning teacher in the Bellingham
        School District might be paid $30,000 the first year. For each year of experience after this up to
        10 years, a 2 percent increase over the preceding value is received. Write a program that displays
        a salary schedule for teachers in a school district. The inputs are the starting salary, the percentage
        increase, and the number of years in the schedule. Each row in the schedule should contain
        the year number and the salary for that year.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Starting Salary: ");
        double startingSalary = scanner.nextInt();

        System.out.print("Percentage Increase: ");
        double percentageIncrease = scanner.nextInt();
        percentageIncrease = percentageIncrease/100;

        System.out.print("Years in Schedule: ");
        double scheduleYears = scanner.nextInt();

        for(int i = 1; i <= scheduleYears; i++) {
            /* P = C (1 + r)^t
            P = future value
            C = initial deposit
            r = interest rate (expressed as a fraction: eg. 0.06)
            t = number of years invested
            */
            double result = (startingSalary * Math.pow(1.0 + percentageIncrease, i));
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.CEILING);

            System.out.println("Year " + i + ": " + df.format(result));
        }
    }
}
