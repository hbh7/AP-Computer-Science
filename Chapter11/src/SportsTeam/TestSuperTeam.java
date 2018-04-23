package SportsTeam;
//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 11: Classes Continued
// Inheritance: SportsTeam
// TestSuperTeam.java
//
public class TestSuperTeam
{
    public static void main (String [] args) {

        SportsTeam Huskies = new SportsTeam("Huskies");
        SportsTeam Bulldogs = new SportsTeam("Bulldogs", 100, 55,20,10);
        SportsTeam Brandons = new SportsTeam("Brandons", 4, 9000,-100,0);

        System.out.println(Huskies);
        System.out.println(Bulldogs);
        System.out.println(Brandons);

        for(int i = 0; i<80; i++) Huskies.playGame("W");
        for(int i = 0; i<30; i++) Huskies.playGame("L");
        for(int i = 0; i<20; i++) Huskies.playGame("T");

        System.out.println(Huskies);

    }
}
