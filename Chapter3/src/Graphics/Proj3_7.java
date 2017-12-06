package Graphics;

import javax.swing.*;
import java.awt.*;

public class Proj3_7 {
    public static void main(String [] args) {

        /*
        Write a graphics program that displays the coordinates of the center point of a panel in the
        form (x, y). This information should be displayed at the panel’s center point and be automatically
        updated when the panel is resized.
        */

        JFrame theGUI = new JFrame();
        theGUI.setTitle("GUI Program");
        theGUI.setSize(300, 200);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorPanelProj3_7 panel = new ColorPanelProj3_7(Color.white);
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);


    }
}
