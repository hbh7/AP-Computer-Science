import java.util.Random;
import java.util.Scanner;

public class tests {
    public static void main (String [] args) {

        System.out.println(3/2*5.0);

        String x = "Wizard";
        String y = "Java";
        System.out.println(y + "\\n" + x + "\\n");

        int thins = 1;

        Scanner scanner = new Scanner(System.in);

        //double line1 = scanner.nextDouble();
        //scanner.nextLine();
        //String line2 = scanner.nextLine();

        //System.out.println(line1);
        //System.out.println(line2);

        int meme = 1;
        double meme2 = meme;

        //int test-dashes;

        System.out.println(meme2); /*meme*/

        String a = "meme";
        String b = "test";
        int c = 3;

        //a/b;
        //a/c;

        System.out.println(Math.round(42.6));
        Random randomGenerator = new Random();
        System.out.println(randomGenerator.nextInt(21));
        System.out.println(randomGenerator.nextDouble()*20);
    }

}
