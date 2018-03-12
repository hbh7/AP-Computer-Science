//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Arrays and Loops
// ArrayAverage.java
// Create a program that initializes an array of 10 numbers of your choosing. Then use a for loop to iterate through
// the array and calculate the sum of the array. Use this sum to output the average.
//

package BasicArraysAndLoops;

public class ArrayAverage {
    public static void main(String [] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        double average = 0;

        for(int i = 0; i < 10; i++) {
            average = average + nums[i];
        }

        System.out.println("The average is " + average/10);

    }
}
