import java.util.Scanner;

public class SitUps {
    public static void main (String [] args) throws InterruptedException {

        /*
        Write a program that will ask the user "How many sit ups do you want me to do?" Then you will use a while loop
        to output the following statements: ("Sit Up Number " + i) where i is the variable that keeps on increasing
        until the desired number of sit ups has been achieved.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sit ups do you want to do on this FitnessGram Push Up Test? ");
        int sitUps = scanner.nextInt();

        System.out.println("We'll now begin the push up test. Ready? Begin.");

        int i = 1;
        if (sitUps < 1) {
            System.out.println("Lazy! You can't even do a single push up? Wow");
        } else {
            while (i < (sitUps + 1)) {
                System.out.println("Down");
                Thread.sleep(2000);
                System.out.println("Up. " + i);
                Thread.sleep(500);
                i++;
            }
        }
    }

}
