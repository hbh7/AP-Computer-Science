package Projects;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class proj4_9 {
    public static void main (String [] args) throws IOException {

        /*
        Modify the program of Project 4-8 so that it processes a file of inputs. Each line of the file
        contains a base and an exponent. The program should read the data from each line, compute the
        result, and display each set of inputs and their result on an output line in the terminal window.
         */

        FileInputStream fis = new FileInputStream("C:/Datastore/School/School - 12th Grade/AP Computer Science/IdeaProjects/Chapter4/src/Projects/input.txt");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        while ((line = br.readLine()) != null) {

            String[] parts = line.split(",");
            String base = parts[0];
            String power = parts[1];

            int baseInt = Integer.parseInt(base);
            int powerInt = Integer.parseInt(power);

            System.out.println(base + " to the power of " + power + " is " + (int) Math.pow(baseInt,powerInt));

        }

        br.close();

    }

}
