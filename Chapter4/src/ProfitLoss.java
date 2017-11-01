import java.util.Scanner;

public class ProfitLoss {
    public static void main (String [] args) {

        // Write a program that will ask the user to enter the amount of money they made this week and then it will
        // ask the user how much money they spent this week (both should be stored in double variables). Now use an
        // if/else to determine if the user made more money than they spent. If they did, it should output "You made
        // a profit this week." Otherwise, it should say "You lost money this week!"


        Scanner scanner = new Scanner(System.in);

        System.out.print("What was your profit this week? ");
        int profit = scanner.nextInt();

        System.out.print("What were your losses this week? ");
        int losses = scanner.nextInt();

        if(profit >= losses) {
            System.out.println("Good job! You made a net profit of $" + (profit-losses));
        } else {
            System.out.println("Failure! You have a net loss of $" + (losses-profit));
        }

    }

}
