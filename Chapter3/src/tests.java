import java.util.Scanner;

public class tests {
    public static void main (String [] args) {

        System.out.println(3/2*5.0);

        String x = "Wizard";
        String y = "Java";
        System.out.println(y + "\\n" + x + "\\n");

        int thins = 1;

        Scanner scanner = new Scanner(System.in);

        double line1 = scanner.nextDouble();
        scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line1);
        System.out.println(line2);


    }

}
