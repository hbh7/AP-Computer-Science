import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Hi There!!!");
        theGUI.setSize(1920,1080);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.red);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.blue);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.red);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.blue);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.white);


        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(2,2));
        pane.add(northPanel, BorderLayout.NORTH);
        pane.add(eastPanel, BorderLayout.EAST);
        pane.add(southPanel, BorderLayout.SOUTH);
        pane.add(westPanel, BorderLayout.WEST);
        pane.add(centerPanel, BorderLayout.CENTER);

        String inputStr = JOptionPane.showInputDialog("Enter your age", "");

        theGUI.setVisible(true);
    }
}

