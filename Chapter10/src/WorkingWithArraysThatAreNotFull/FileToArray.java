//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Working with Arrays That Are Not Full
// Example 10.2
// Input numbers from a file into an array and
// output the array's numbers to the terminal window
//

package WorkingWithArraysThatAreNotFull;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToArray {
    public static void main(String [] args) throws IOException {

        // Set up scanner and array
        Scanner reader = new Scanner(new File("Chapter10/src/WorkingWithArraysThatAreNotFull/numbers.txt"));
        int[] array = new int[10];
        int count = 0;
        // Input numbers until full or end of file is reached
        while (count < array.length  && reader.hasNext()){
            int number = reader.nextInt();
            array[count] = number;
            count++;
        }
        // Output the numbers to the terminal window
        for (int i = 0; i < count; i++)
            System.out.println(array[i]);
        // Display error message if not all data are read from file
        if (reader.hasNext())
         System.out.println("Some data lost during input");

    }
}