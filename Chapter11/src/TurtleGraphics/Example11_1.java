package TurtleGraphics;//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 11: Classes Continued
// 11.2: Turtle Graphics
// Example11_1.java
//

public class Example11_1 {
    public static void main(String [] args) {

        // Instantiate a pen object :D
        StandardPen pen = new StandardPen();

        // Lift the pen, move it to the square's upper-left corner, and lower it again
        pen.up();
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.down();

        // Draw the square
        pen.turn(90); pen.move(50);
        pen.turn(90); pen.move(50);
        pen.turn(90); pen.move(50);
        pen.turn(90); pen.move(50);

    }
}
