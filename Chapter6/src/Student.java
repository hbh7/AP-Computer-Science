import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Student {

    // Code written by hbh7
    // hbh7.com
    // github.com/hbh7/AP-Computer-Science

    // Instance variables
    private String name;
    private ArrayList<Integer> testScores = new ArrayList<>();
    private int studentID;

    // Constructor method
    public Student(){
        name = "";
        generateRandomScores();
        studentID = 0;
    }

    public void setName (String nm){
        name = nm;
    }

    public String getName (){
        return name;
    }

    public void setStudentID (int id){
        // Set a student's name
        studentID = id;
    }

    public int getStudentID (){
        return studentID;
    }

    public void setScore (int i, int score){
        testScores.set((i-1), score);
    }

    public int getScore (int i){
        return testScores.get(i);
    }

    public int getAverage(){
        // Compute and return the average
        int average = 0;
        for (int i:testScores) {
            average = average + i;
        }
        average = average/testScores.size();
        return average;
    }

    public int getHighScore(){
        // Determine and return the highest score
        int highScore = 0;
        for (int i:testScores) {
            if(i > highScore) {
                highScore = i;
            }
        }
        return highScore;
    }

    public int getLowScore(){
        // Determine and return the highest score
        int lowScore = 100;
        for (int i:testScores) {
            if(i < lowScore) {
                lowScore = i;
            }
        }
        return lowScore;
    }

    public String toString(){
        // Construct and return a string representation of the student
        String str;
        str = "Name: " + name + "\n" +
              "Student ID: " + studentID + "\n" +
              "Test Scores: " + Arrays.toString(testScores.toArray()) + "\n" +
              "Average: " + getAverage() + "\n" +
              "High Score: " + getHighScore() + "\n" +
              "Low Score: " + getLowScore();
        return str;
    }

    private void generateRandomScores() {
        for(int i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 101);
            testScores.add(randomNum);
        }
    }
}