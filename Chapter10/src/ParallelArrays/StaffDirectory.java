//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Parallel Arrays
// StaffDirectory.java
// Write a program that simulates a Staff directory. You should declare and instantiate 3 arrays. One will be for names,
// one will be for department, and one will be for room numbers. Use the staff directory on the Pathways website to
// populate these three arrays with information about 5 real teachers. This shuld be done similar to the example
// on page 353.
// String[] name = {"Bill", "Sue", "Shawn", "Mary", "Ann"};
// int[]    age  = {20    , 21    , 19    , 24    , 20};
// Finally, you will use a for loop to output the name, department, and room number in one line for each staff member.
// Your output will look like this:
//    Raul Vargas 300 Technology
//    Beverly Moquin 123 Math
//    Lizz Maurer 132 English
//    ...
//

package ParallelArrays;

public class StaffDirectory {
    public static void main (String[] args) {

        String[] name = {"Katie Boiteau", "Matt Hay", "Mary Mullen-Barnett", "Cheryl Parasiliti", "Victoria Russo"};
        int[] roomNum = {310, 426, 114, 427, 402};
        String[] department = {"Science", "Social Studies", "English", "Social Studies", "Science"};

        for(int i = 0; i < 5; i++) {
            System.out.println(name[i] + ", Room " + roomNum[i] + ", " + department[i] + " Department.");
        }

    }
}
