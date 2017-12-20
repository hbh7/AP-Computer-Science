import java.util.Scanner;

// Example 6.1: Test program for Student class
public class ScholarshipGiver {
    public static void main (String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the name of the first student? ");
        String s1name = scanner.next();
        s1.setName(s1name);

        System.out.print("What is their student ID? ");
        int studentID = scanner.nextInt();
        s1.setStudentID(studentID);

        int i = 1;
        while (true) {
            System.out.print("Enter a test score for student 1 (enter done when finished): ");
            String testScore = scanner.next();
            if (testScore.toLowerCase().equals("done"))
                break;
            s1.setScore(i, Integer.parseInt(testScore));
            i++;
        }


        System.out.print("What is the name of the second student? ");
        String s2name = scanner.next();
        s2.setName(s2name);

        System.out.print("What is their student ID? ");
        studentID = scanner.nextInt();
        s2.setStudentID(studentID);

        i = 1;
        while (true) {
            System.out.print("Enter a test score for student 2 (enter done when finished): ");
            String testScore = scanner.next();
            if (testScore.toLowerCase().equals("done"))
                break;
            s2.setScore(i, Integer.parseInt(testScore));
            i++;
        }

        String highScorer = "";

        if (s1.getAverage() > s2.getAverage()) {
            highScorer = s1.getName();
        } else {
            highScorer = s2.getName();
        }

        System.out.println("The person who deserves the scholarship is " + highScorer);


    }
}