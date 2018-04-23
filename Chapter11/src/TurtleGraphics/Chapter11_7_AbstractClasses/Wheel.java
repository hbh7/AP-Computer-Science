package TurtleGraphics.Chapter11_7_AbstractClasses;

// Wheel.java: The class for wheels
// We have already explained most of the major points in this class.
import TurtleGraphics.Pen;
public class Wheel extends Circle{
    private int spokes;
    public Wheel(){
        super();
        spokes = 0;
    }
    public Wheel (double xLoc, double yLoc, double r, int s){
        super (xLoc, yLoc, r);
        spokes = s;
    }
    public void draw (Pen p){
// Draw the wheel's rim
        super.draw (p);
// Draw the spokes
        for (int i = 1; i <= spokes; i++){
            p.up();
            p.move (xPos, yPos);
            p.setDirection (i * 360.0 / spokes);
            p.down();
            p.move (radius);
        }
    }
    public void setSpokes (int s){
        spokes = s;
    }
    // We could not call super.toString() in this toString method, because
// doing so would have activated the method in Circle rather than the
// method we wanted in AbstractShape.
    public String toString(){
        String str = "WHEEL\n"
                + "Radius: " + radius + "\n"
                + "Spokes: " + spokes + "\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                + "Area: " + area();
        return str;
    }
}
