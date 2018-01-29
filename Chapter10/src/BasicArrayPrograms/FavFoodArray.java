//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Array Programs
// 1. FavFoodArray
// Declare and Instantiate an Array of 5 strings. Name it "foods" and set each element in the array to one of your
// favorite foods. Finally, print out the 3rd item in the array with the following line of code:
// System.out.println(foods[2]);
//

package BasicArrayPrograms;

public class FavFoodArray {
    public static void main(String [] args) {

        String[] foods = {"Pizza", "Wings", "Steak", "Potatoes", "Goldfish"};

        System.out.println("My third favorite food is " + foods[2] + ".");

    }
}
