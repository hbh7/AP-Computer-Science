package Graphics;

import javax.swing.*;
import java.awt.*;

public class ColorPanelProj3_6 extends JPanel {
    public ColorPanelProj3_6(Color backColor) {
         setBackground(backColor);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawLine(150,100,350,100);

        g.drawLine(150,100,200,150);
        g.drawLine(150,100,200,50);

        g.drawLine(350,100,300,150);
        g.drawLine(350,100,300,50);



        g.drawLine(150,200,350,200);

        g.drawLine(150,200,100,250);
        g.drawLine(150,200,100,150);

        g.drawLine(350,200,400,250);
        g.drawLine(350,200,400,150);

    }
}
