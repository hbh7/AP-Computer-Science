//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Array Programs
// 5. EvenOddNegList
// Write a program that takes 10 integers as input. The program places the even integers into an array called evenList,
// the odd integers into an array called oddList, and the negative integers into an array called negativeList. The
// program displays the contents of the three arrays after all the integers have been entered.

package BasicArrayPrograms;

import java.util.Scanner;

public class EvenOddNegList {
    public static void main(String [] args) {

        int[] evenList = new int[10];
        int[] oddList = new int[10];
        int[] negativeList = new int[10];

        Scanner scanner = new Scanner(System.in);

        int evenPosition = 0;
        int oddPosition = 0;
        int negativePosition = 0;

        for(int i = 0; i < 10; i++) {
            if(i == 0)
                System.out.print("Please enter a number: ");
            else
                System.out.print("Please enter another number: ");

            int temp = scanner.nextInt();
            if(temp < 0) {
                negativeList[negativePosition] = temp;
                negativePosition++;
            } else if (temp % 2 == 0) {
                evenList[evenPosition] = temp;
                evenPosition++;
            } else {
                oddList[oddPosition] = temp;
                oddPosition++;
            }
        }
        System.out.println("Thank you.");

        System.out.println("E | O | N");
        for(int i = 0; i < 10; i++) {
            String output = "";
            boolean print = false;

            if(i < evenPosition) {
                output = output + evenList[i] + " | ";
                print = true;
            } else {
                output = output + "  | ";
            }
            if(i < oddPosition) {
                output = output + oddList[i] + " | ";
                print = true;
            } else {
                output = output + "  | ";
            }
            if(i < negativePosition) {
                output = output + negativeList[i];
                print = true;
            }

            if(print)
                System.out.println(output);
        }


    }

}
