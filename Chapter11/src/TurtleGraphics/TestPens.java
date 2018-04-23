package TurtleGraphics;

import TurtleGraphics.*;

public class TestPens {
    public static void main (String[] args) {

        Pen p1, p2, p3;

        p1 = new StandardPen();
        p2 = new WigglePen();
        p3 = new RainbowPen();

        /*
        drawSquare(p1);
        drawSquare(p2);
        drawSquare(p3);
        */

        drawSquare(p1, 10, 10, 300);
        drawSquare(p2, 10, 10, 300);
        drawSquare(p3, 10, 10, 300);

    }

    static private void drawSquare(Pen p) {
        for (int i = 1; i <= 4; i++) {
            p.move(50);
            p.turn(90);
        }
    }

    static private void drawSquare(Pen p, int xStart, int yStart, int sideLength) {
        p.up();
        p.move(xStart, yStart);
        p.turn(-135);
        p.down();

        for (int i = 1; i <= 4; i++) {
            p.move(sideLength);
            p.turn(90);
        }
    }
}
