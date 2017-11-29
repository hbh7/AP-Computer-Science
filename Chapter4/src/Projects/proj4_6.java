package Projects;

import java.util.Scanner;

public class proj4_6 {
    public static void main (String [] args) {

        /*
        A local biologist needs a program to predict population growth. The inputs would be the initial
        number of organisms, the rate of growth (a real number greater than 0), the number of hours
        it takes to achieve this rate, and a number of hours during which the population grows. For
        example, one might start with a population of 500 organisms, a growth rate of 2, and a growth
        period to achieve this rate of 6 hours. Assuming that none of the organisms die, this would imply
        that this population would double in size every 6 hours. Thus, after allowing 6 hours for growth,
        we would have 1000 organisms, and after 12 hours, we would have 2000 organisms. Write a
        program that takes these inputs and displays a prediction of the total population.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Initial Number of Organisms: ");
        int numOfOrganisms = scanner.nextInt();

        System.out.print("Rate of Growth: ");
        int rateOfGrowth = scanner.nextInt();

        System.out.print("Number of Hours for Growth: ");
        int hoursForGrowth = scanner.nextInt();

        System.out.print("Number of Hours Growing: ");
        int hoursGrowing = scanner.nextInt();

        System.out.print("New Population: " + numOfOrganisms * rateOfGrowth * (hoursGrowing/hoursForGrowth));

    }

}
