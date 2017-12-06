package Graphics;

import javax.swing.*;
import java.awt.*;

public class mauritiusFlag {
    public static void main(String[] args){

        // National flags are diaplyed on various Web sites such as http://flagspot.net/flags/. The flags of France,
        // Mauritius, and Bulgaria consist of flat, colored areas. Write separate programs that display these flags.
        // Mauritius.

        JFrame GUI = new JFrame();
        GUI.setTitle("Fourth GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.green);

        Container pane = GUI.getContentPane();
        pane.setLayout(new GridLayout(4,1));

        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);

        GUI.setVisible(true);

    }
}