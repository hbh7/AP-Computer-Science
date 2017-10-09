import java.util.Scanner;

public class TestTerminalIO {
    public static void main (String [] args) {

        System.out.println("Welcome to Terminal IO Test!");

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double weight;

        System.out.print("Enter your name (a string): ");
        name = scanner.nextLine();

        System.out.print("Enter your age (an int): ");
        age = scanner.nextInt();

        System.out.print("Enter your weight (a double): ");
        weight = scanner.nextDouble();

        System.out.println ("Greetings " + name +
                ". You are " + age +
                " years old and you weigh " + weight +
                " pounds.");

        double wage;
        int ssn;

        System.out.print("Please enter your wage: ");
        wage = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ok thanks, now please enter your SSN (I promise it's secure)(lol): ");
        ssn = scanner.nextInt();

        System.out.println("Kay thanks. You entered:");
        System.out.println(wage);
        System.out.println(ssn);

    }

}
