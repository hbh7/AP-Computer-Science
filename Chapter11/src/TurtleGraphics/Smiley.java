package TurtleGraphics;//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 11: Classes Continued
// 11.2: Turtle Graphics
// Smiley.java
//

import TurtleGraphics.*;
import java.awt.*;

public class Smiley {
    public static void main(String [] args) {

        // Instantiate a pen object :D
        Pen pen = new StandardPen();

        // Lift the pen, move it to the square's upper-left corner, and lower it again
        pen.up();
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.down();

        // Left Eye
        pen.turn(90); pen.move(50);
        // Move to other eye
        pen.up(); pen.turn(270); pen.move(50);
        pen.turn(270); pen.move(50);
        pen.turn(180);
        // Right Eye
        pen.down(); pen.move(50);

        // Move to mouth
        pen.up(); pen.move(30);

        // Draw mouth
        pen.down(); pen.move(20);
        pen.turn(90);
        pen.move(50);
        pen.turn(90);
        pen.move(20);


    }
}
