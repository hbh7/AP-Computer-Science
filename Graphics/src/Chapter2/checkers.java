package Chapter2;

import javax.swing.*;
import java.awt.*;

public class checkers {
    public static void main(String[] args){

        // Write a program that displays a 3x3 grid of black and white rectangles. The rectangles should be positioned
        // so that no two rectangles of the same color are adjacent to each other

        JFrame GUI = new JFrame();
        GUI.setTitle("Fourth GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.white);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.black);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.white);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.black);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.white);

        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.black);

        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.white);

        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.black);

        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.white);

        Container pane = GUI.getContentPane();
        pane.setLayout(new GridLayout(3,3));

        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);
        pane.add(panel5);
        pane.add(panel6);
        pane.add(panel7);
        pane.add(panel8);
        pane.add(panel9);

        GUI.setVisible(true);

    }
}