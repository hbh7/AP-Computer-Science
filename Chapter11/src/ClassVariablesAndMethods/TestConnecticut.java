package ClassVariablesAndMethods;
//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 11: Classes Continued
// 11.1: Class (static) Variables and Methods
// TestConnecticut.java
// Create a class named TestConnecticut. Notice we are referencing a method in Connecticut named printStateSong()
// and a variable named Capital. Notice that Connecticut below is a class and that we never instantiated an object of
// type connecticut. This means that the variable Capital and the method printStateSong() must both be static.
//

import java.util.Scanner;

public class TestConnecticut {
    public static void main(String [] args) {

        Connecticut.printStateSong();
        System.out.println();
        System.out.println("The capital is " + Connecticut.Capital);
    }
}

class Connecticut {
    static String Capital = "Hartford";

    public static void printStateSong() {

        System.out.println("Yankee Doodle went to town,\n" +
                "Riding on a pony,\n" +
                "Stuck a feather in his hat,\n" +
                "And called it macaroni.\n" +
                "\n" +
                "Yankee Doodle keep it up,\n" +
                "Yankee Doodle dandy,\n" +
                "Mind the music and the step,\n" +
                "And with the folks be handy.");
    }

}