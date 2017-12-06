package Graphics;

import javax.swing.*;
import java.awt.*;

public class Proj3_6 {
    public static void main(String [] args) {

        /*
        The Müller-Lyer illusion is caused by an image that consists of two parallel line segments.
        One line segment looks like an arrow with two heads, and the other line segment looks like an
        arrow with two tails. Although the line segments are of exactly the same length, they appear to
        be unequal (see Figure 3-9). Write a graphics program that illustrates this illusion.
        */

        JFrame theGUI = new JFrame();
        theGUI.setTitle("GUI Program");
        theGUI.setSize(500, 400);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorPanelProj3_6 panel = new ColorPanelProj3_6(Color.white);
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
}
