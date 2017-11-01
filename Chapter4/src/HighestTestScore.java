import java.util.Scanner;

public class HighestTestScore {
    public static void main (String [] args) {

        // Write a program that will ask the user what score Alice got on the test, then it will ask what score Bob
        // got on the test (both of these scores should be stored in Integer variables). It will then check to see who's
        // score is higher and it will output "Alice did better on the test"  or "Bob did better on the test"
        // depending on who does better.


        Scanner scanner = new Scanner(System.in);

        System.out.print("What's Bob's test score? ");
        int bobScore = scanner.nextInt();

        System.out.print("What's Alice's test score? ");
        int aliceScore = scanner.nextInt();

        if(bobScore > aliceScore) {
            System.out.println("Bob did better on the test. Rekt");
        } else if (bobScore == aliceScore) {
            System.out.println("Neither did better on the test. Good job to both of them.");
        } else {
            System.out.println("Alice did better on the test. Rekt");
        }

    }

}
