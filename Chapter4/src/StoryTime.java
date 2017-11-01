import java.util.Scanner;

public class StoryTime {
    public static void main (String [] args) {

        // Write a program that will output the following "If you want to read a happy story, type 1. If you want to
        // hear a scary story, type 2." Then use an if/else statement to output whatever kind of story the user
        // wants to read. (For the stories, just write a quick 2-3 sentence story).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the SPOOOOOOKY story machine! ");
        System.out.print("What'll it be? Happy or spooky? ");

        String choice = scanner.next();

        switch(choice.toLowerCase()){
            case ("happy"):
                System.out.println("Mr. Vargas won the lottery! :D He bought everyone pink lambos!");
                break;
            case("spooky"):
                System.out.println("BOO!");
                break;
            default:
                System.out.println("Sorry kid, that's not an option lol.");
        }

    }

}
