package IOProjects;

import java.util.Scanner;

public class IntegerToInvidualDigits {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Integer please! ");
        String integer = scanner.next();

        for (int i = 0;i < integer.length(); i++){
            System.out.println(integer.charAt(i));
        }
    }
}
