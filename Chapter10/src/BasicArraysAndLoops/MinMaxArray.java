//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Arrays and Loops
// MinMaxArray.java
// Create a program that initializes an array of 10 numbers of your choosing. Then use a for loop to iterate through
// the array and then output the largest value and the smallest value.
//

package BasicArraysAndLoops;

public class MinMaxArray {
    public static void main(String [] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int largestValue = 0;
        int smallestValue = 0;

        for(int i = 0; i < 10; i++) {
            if(i == 0) {
                largestValue = nums[0];
                smallestValue = nums[0];
            }

            if(nums[i] > largestValue)
                largestValue = nums[i];

            if(nums[i] < smallestValue)
                smallestValue = nums[i];

        }

        System.out.println("Largest Number: " + largestValue);
        System.out.println("Smallest Number: " + smallestValue);

    }
}
