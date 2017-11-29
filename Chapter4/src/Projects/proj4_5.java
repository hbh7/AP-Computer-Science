package Projects;

import java.util.Scanner;

public class proj4_5 {
    public static void main (String [] args) {

        /*
        The German mathematician Gottfried Leibniz developed the following method to approximate
        the value of pi:
        pi/4 = 1 – 1/3 + 1/5 – 1/7 + . . .
        Write a program that allows the user to specify the number of iterations used in this approximation
        and displays the resulting value.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please let me know the number of iterations you'd like to calculate pi: ");
        int iterations = scanner.nextInt();

        int addNum = 5;
        int subNum = 3;
        double pi = 1;

        for(int count = 1; count <= iterations; count++) {
            if (count % 2 != 0) {
                pi = pi - (1.0/subNum);
                //System.out.println("Iteration " + count + ". -1/" + subNum + ". Current Pi: " + pi*4);
                subNum = subNum + 4;
            } else {
                pi = pi + (1.0/addNum);
                //System.out.println("Iteration " + count + ". +1/" + addNum + ". Current Pi: " + pi*4);
                addNum = addNum + 4;
            }

            int length = (int)(Math.log10(count));
            //System.out.println("Length = " + length);

            double divideBy = Math.pow(10, length);
            //System.out.println("divideBy = " + divideBy);

            //System.out.println("If Statement = " + (count % divideBy));
            if((count % divideBy) == 0.0)
                System.out.println("Processing iteration " + count + ". Current Pi: " + pi*4);

        }
        pi = pi * 4;
        System.out.println(pi);


    }

}
