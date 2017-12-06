package Graphics;

import javax.swing.*;
import java.awt.*;

public class ColorPanel2 extends JPanel {
    public ColorPanel2(Color backColor) {
         setBackground(backColor);
    }
    public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.setColor(Color.blue);
         g.drawRect(10, 5, 120, 20);
         g.setColor(Color.red);
         g.drawString("Hello world!", 20, 20);
    }
}
