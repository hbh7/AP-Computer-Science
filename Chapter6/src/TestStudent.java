public class TestStudent{
    public static void main (String[] args){

        // Example 6.1: Test program for Student class

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Hunter"); // Set the student's name to "Bill"
        s1.setStudentID(11696); // Set the student's name to "Bill"
        s1.setScore(1,100); // Set the score on test 1 to 84
        s1.setScore(2,98); // on test 2 to 86
        s1.setScore(3,99); // on test 3 to 88
        System.out.println(s1);

        System.out.println("----------");

        s2.setName("Emelia"); // Set the student's name to "Bill"
        s2.setStudentID(11684); // Set the student's name to "Bill"
        s2.setScore(1,98); // Set the score on test 1 to 84
        s2.setScore(2,99); // on test 2 to 86
        s2.setScore(3,100); // on test 3 to 88
        System.out.println(s2);

    }
}