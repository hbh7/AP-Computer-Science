//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Arrays and Loops
// ArraySetup.java
// Create a program that initializes an array of 10 numbers of your choosing. Then use a for loop to iterate through
// the array and output each element of the array.
// Hint: This program is like a template. You can use the same array initialization and values as well as the loop for
// the other programs here (except the one that uses a while loop).
//

package BasicArraysAndLoops;

public class ArraySetup {
    public static void main(String [] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < 10; i++) {
            System.out.println("Index " + i + ": " + nums[i] + "");
        }

    }
}
