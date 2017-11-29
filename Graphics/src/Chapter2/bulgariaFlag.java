package Chapter2;

import javax.swing.*;
import java.awt.*;

public class bulgariaFlag {
    public static void main(String[] args){

        // National flags are displayed on various Web sites such as http://flagspot.net/flags/. The flags of France,
        // Mauritius, and Bulgaria consist of flat, colored areas. Write separate programs that display these flags.
        // Bulgaria.

        JFrame GUI = new JFrame();
        GUI.setTitle("Fourth GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.white);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);

        Container pane = GUI.getContentPane();
        pane.setLayout(new GridLayout(3,1));

        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);

        GUI.setVisible(true);

    }
}