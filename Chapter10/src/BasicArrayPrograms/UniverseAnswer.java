//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Array Programs
// 4. UniverseAnswer
// Instantiate an array of 10 integers and using a loop, ask the user for 10 numbers and store the values in the
// array. Then use another loop to go through the array. If the number 42 occurs in the list, output that the answer
// to the universe occurs at whatever spot it was found in the break. If the last element is reached and it is not
// 42, then output "Fool, this list does not contain the answer to the universe!".

package BasicArrayPrograms;

import java.util.Scanner;

public class UniverseAnswer {
    public static void main(String [] args) {

        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        int position = 0;

        for(int i = 0; i < 10; i++) {
            if(i == 0)
                System.out.print("Please enter a number: ");
            else
                System.out.print("Please enter another number: ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Thank you.");

        for(int i = 0; i < 10; i++) {
            if(nums[i] == 42)
                position = i;
        }

        if(position != 0)
            System.out.println("The answer to the universe occurs at array position " + position + ", or number " +
                    (position+1) + " in the array!");
        else
            System.out.println("Fool, this list does not contain the answer to the universe!");

    }
}
