package ForLoopProjects;

public class MultiplicationTableMatrix {
    public static void main (String [] args) {

        /*
        Write a program that will output the 10 times multiplication table. It will use two for loops and the output
        should look something like this:

        Ya no I'm not writing it out. Just run the program.
        */

        for(int r1 = 1; r1 <= 10; r1++) {
            for(int c1 = 1; c1 <= 10; c1++) {
                int outNum = r1 * c1;
                if(outNum<10) {
                    print("0" + outNum + " ");
                } else {
                    print(outNum + " ");
                }
            }
            println("");
        }

    }

    public static void print(String statement) {
        System.out.print(statement);
    }

    public static void println(String statement) {
        System.out.println(statement);
    }

}
