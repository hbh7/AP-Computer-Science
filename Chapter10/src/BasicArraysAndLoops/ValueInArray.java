//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Arrays and Loops
// ValueInArray.java
// Create a program that initializes an array of 10 numbers of your choosing. Then use an infinite while loop to
// continuously ask the user for a number and then tell them if the number was in the array and at what location.
// If the number was not in the array, tell them so. When the user types -1, allow them to break the loop.
//

package BasicArraysAndLoops;

import java.util.Scanner;

public class ValueInArray {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        boolean allowedToBreakLoop = false;

        while(true) {
            if(allowedToBreakLoop)
                System.out.print("Please enter a number (-1 to break the loop): ");
            else
                System.out.print("Please enter a number (-1 to be allowed to break the loop): ");

            int userInput = scanner.nextInt();
            if(userInput == -1) {
                if (allowedToBreakLoop == false) {
                    System.out.println("You are now allowed to break the loop. Good luck.");
                    allowedToBreakLoop = true;
                    continue;
                } else {
                    break;
                }
            }

            if(testInArray(nums, userInput))
                System.out.println("Your number was found in the array! :D");
            else
                System.out.println("Your number was not found in the array :( ");
        }

    }

    static private boolean testInArray(int[] nums, int testNum) {
        for (int i: nums) {
            if(i == testNum)
                return true;
        }
        return false;
    }
}
