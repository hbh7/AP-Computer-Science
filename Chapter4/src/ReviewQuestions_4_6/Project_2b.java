package ReviewQuestions_4_6;

public class Project_2b {
    public static void main (String [] args) {

        String prevStore = "";

        for (int i = 10; i >= 1; i--) {
            prevStore = prevStore + " " + i;
        }
        System.out.println(prevStore);
    }
}
