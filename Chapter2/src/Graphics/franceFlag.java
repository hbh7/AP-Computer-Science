package Graphics;


import javax.swing.*;
import java.awt.*;

public class franceFlag {
    public static void main(String[] args){

        // National flags are diaplyed on various Web sites such as http://flagspot.net/flags/. The flags of France,
        // Mauritius, and Bulgaria consist of flat, colored areas. Write separate programs that display these flags.
        // France.

        JFrame GUI = new JFrame();
        GUI.setTitle("Fourth GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.blue);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.white);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);

        Container pane = GUI.getContentPane();
        pane.setLayout(new GridLayout(1,3));

        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);

        GUI.setVisible(true);

    }
}