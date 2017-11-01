import java.util.Scanner;

public class TheClub {
    public static void main (String [] args) {

        // Write a program that will output the following "Welcome to the Java Night Club, how old are you?" If the
        // user is older than 18, the program should output "Welcome, have fun" If the user is under 18, it should
        // say "Get out of here little kid!"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the salty spitoon! How tough are ya? (age) ");

        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("Uhh right this way, sorry to keep you waiting.");
        } else {
            System.out.println("Listen, kid. I think you'd be more comfortable over at Weenie Hut Jr.");
        }


    }

}
