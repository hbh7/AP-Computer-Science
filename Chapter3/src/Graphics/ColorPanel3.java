package Graphics;

import javax.swing.*;
import java.awt.*;

public class ColorPanel3 extends JPanel {
    public ColorPanel3(Color backColor) {
         setBackground(backColor);
    }
    
    public void paintComponent(Graphics g){
         super.paintComponent(g);
         int x = getWidth() / 2 - 60;
         int y = getHeight() / 2;
         g.setColor(Color.blue);
         g.drawRect(x, y, 120, 20);
         g.setColor(Color.red);
         g.drawString("Hello world!", x + 10, y + 15);
    }
}
