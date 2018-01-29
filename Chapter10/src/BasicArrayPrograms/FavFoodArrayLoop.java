//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 10: Introduction to Arrays
// Basic Array Programs
// 2. FavFoodArrayLoop
// Modify the previous program to use a loop to input the 5 food items and another loop to output the 5 items.
//

package BasicArrayPrograms;

import java.util.Scanner;

public class FavFoodArrayLoop {
    public static void main(String [] args) {

        String[] foods = new String[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("Please enter one of your favorite foods: ");
            foods[i] = scanner.next();
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("Favorite Food " + i + ": " + foods[i] + "");
        }

    }
}
