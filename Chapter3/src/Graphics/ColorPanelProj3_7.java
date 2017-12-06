package Graphics;

import javax.swing.*;
import java.awt.*;

public class ColorPanelProj3_7 extends JPanel {
    public ColorPanelProj3_7(Color backColor) {
         setBackground(backColor);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = getWidth() / 2 - 60;
        int y = getHeight() / 2;g.setColor(Color.blue);
        g.drawRect(x, y, 120, 20);
        g.setColor(Color.red);
        Font font = new Font("Courier", Font.BOLD, 14);
        g.setFont(font);
        g.drawString(("X: " + x + " Y: " + y), x + 10, y + 15);
    }
}
