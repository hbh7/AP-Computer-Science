package TurtleGraphics.Chapter11_4;

import TurtleGraphics.Pen;

public class Rekt implements Shape {

    private double xPos, yPos;
    private double height, width;
    public Rekt(){
        xPos = 0;
        yPos = 0;
        height = 1;
        width = 1;
    }
    public Rekt(double xLoc, double yLoc, double w, double h){
        xPos = xLoc;
        yPos = yLoc;
        height = h;
        width = w;
    }
    public double area(){
        return height * width;
    }
    public void draw(Pen p){
        p.up();
        p.move (xPos, yPos);
        p.down();
        p.setDirection (0); p.move (width);
        p.turn(-90); p.move(height);
        p.turn(-90); p.move(width);
        p.turn(-90); p.move(height);
    }

    public double getXPos(){
        return xPos;
    }
    public double getYPos(){
        return yPos;
    }
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
    }
    public void stretchBy(double factor){
        height *= factor;
        width *= factor;
    }
    public String toString(){
        String str = "RECTANGLE\n"
                + "Width & Height: " + width + " & " + height +"\n"
                + "(X,Y) Position: (" + xPos + "," + yPos + ")\n"
                + "Area: " + area() + "\n"
                + "Perimeter: " + perimeter();
        return str;
    }

    public double perimeter() {
        return width * 2 + height * 2;
    }

}

/*
mmmmmmmmNmmmmmNmmmNmmmmmmmmmNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmNNNNNNNNNNNNNNNNNNNNNNNNNmNNNNmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmNNNNNmmmNmmNNmNNN
NNmmNNNNNNmmmNNmNNNmmmNNNNNmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmNNmNNmNNmNNNNNmmmmmmmNmmmmmNmmmNmmNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
mmmNNNmmmNNNNNNNNNNNNNNNNNNNmNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNmmNNNNmmmmmmmmmmmmmmmmmmmmmdddmmdmmmmmdhdNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
NNNNmNNNNNNNNNNNNNNNNNmmNNNmNNmmmmmmmmmNmmNNNNNNNNNNNNmmNdmNNmmmmmmmmmmmmmmmmmmmmmNmNmmdmmmmmmmNmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmmmmmmdddddddddddddmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmNmmmmmmNmmmNNNmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNmmNNNNNNNNNNNNNNNNNNNmmNNNNNNNNNNNmmmmdddddhhhhhhhhhhhhhhhhhhddddmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmNNNNmmmNNmmmmmmNmNNNmNmNNNNNNNNNNNNNNNNNNNNNNNNNN
mmNNNNNNNNNNmNNNNNNNNNNNmmmNNmNNNNNNmmNNmmNNNNNNNmmmmdddhhhhhyyyyyyyyyyyyyyyyyyyyyyhhhddmmmmmmmmmmmmNmmmmmNNNNNmNNNNNNNNNNNNNNNNNNNNmNNNNNNNNNNmNNNNNNNNNNmmNNNNmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
NNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmNNNNNNNNNNNNNNNmmmmddhhhhyyyyyyyyhhhhhhhhhhhhhhyyyyyyyyyhhhddmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmNNNmmmmmmmNNNNNNNNNN
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmmmddhyyyyyyhhhhhddddddddddddddddhhhhyyyyyyyhhhdddddddddddddmmmdddmdmmmmmmmmmmmmmmmmmdmmmmdmmddmmmmmddmmmmmmmddddddddddhddddddddmmmmmmmmmmmmNmNmmmNNNNNNNN
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmNmNNmNmmmmmmdhhyyyyyhdddddmmmmmmmmmmmmmmmmmmmdddddhhhhyhhhddmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddhhhyyyyyyyyyyyyhhhdddmmmmNNNNNNNNNNNNNNNNNNN
mNNNNNNNNNNNNNNNNNNNNNNNNNNNmNNmNNNmmmmmmmNNNmmdhhyyyhhdmmmmmddmmNNmmmmmmmmmmmmmmmmmmmmmddhhhhhdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddhhyhyyhhhhhhhhhhhhhyyyhhddmmNNNNNNNNNNNNNNNNNNN
mNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmNNNNmNNmmmNNNNmmdhyyyhddmmmNmmddmmmNmmNmmmmmmmmmmmmmmmmmmmmmdhhhhddmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddmmmmmmddhhhhhhhhdddmmmmmmmmmmmddhhyyhhdmmNmmNNmmNNNNNNNNNNN
NmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmNNNNNNNNNNNNNNNmhyyyhdmmNmNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddhhhhdmmmmmmmmmmmmmdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdhddhhyhyhhdddmmmmmmmmmmmmmmmmmddhhyyhdmmmNmNNmmmmmNNmmNNN
mmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmhyyyhdmmmmmmNNNNNNNNNNNNNNNNNNNmNNNNNNNNNNNNNmmdhhhdmmNNNmdmNNNNNNmmNNNNNNNNNNNNNNNNNmmNNNNNNmmdhhyhhhddmmmNNNNNNNNNNNNNNNNNNmmmdhhyhhdmmmNNmmmmmmmmmmmNN
mmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhyyhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhhhdmNNNNNNNNNNNNmNNNNNNNNNNNNNNNNNNNNNNNNmmdhhhhddmmmNNNNNNNNNNNNNNNNNNNNNNNNNmdhyyhdmmmNNmmNNNNNNmmNNN
mmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmdhyhhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmddhhhddmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmmhhyhmmNNNNNNNNNNNNNNNNN
mmmNNNNmmNmNNNNmmNNNNNNNNNNNmdmNNmNNNNNNNNNNNmmmmhyyyhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmdhhhhdmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmhhhdmNNNNNNNNNNNNNNNNmN
mmNNNNNNNNNNNNNNNNNNNNNNNNNNmdmNNNNmmmNNNmNNNmNmhsosyhhdmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhhdmNNNNNNNNNNNNNNNmNNNNNNNNNNNNNmmddhhhdmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhhhmNNNNNNNNNNNNNNmmNNN
mmmmmmmmmmmmmmmmmmNNNmmmNNNNNNNNNNNmmmNNmmmmNmmhoooooyhhhddmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdhhhdNNNNNNNmmNNNNNNmmNNNNNNNNNNmmdhhhddmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhhdmNNNNNNNNNNNNNNNNNNNN
dddddddddddddddmddddmmmmmmmmmmmddmmmmmmmmmmmmmdsoooooyddhhhhddmmmmmmdmNNNmNNNNNNNNNNNNNNNNNNNNNmdhhhdmNNNNmmNNNNNNNNNNNNNNNNmmmddhhddmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmdhhhdmNNNNNNNNNNNNNNNNNNNmN
hhhhhdhdhdhhhddhhdddddddddddddhsoyhdddddddddddyooooooohmdddhhhhhddysoymmmmmmmmmmmmmNNmNNNNNmmmmmdhhhdmmmmmmmmmmmmmmmmmmmmmmdddhhdddmmmmNNNNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNmmdhhhhddmNNNNNNNNNNNNNNNNNNNNNN
dddddddddddhdddddddddddddddddddsoooyhmddmddddhsoooooooydmmmdddhhhsoooydmmmmmdmmmNNmmmmNNNmmmmmmmmdhhhdmmmmmmmmmmmmmmmmmmdddhhdddmmmmmmmmmmNmmmmNNNNmmNNNNNNNNNNmmmmmmdddhhhhhdmmNNNNNNNNNNNNNNNNNNNNNNNM
mmdmmmmmmmmmddmmmmmmmmmmmmmmmmmhsoooshmmmmmmmyooooooooshmmmmmmmhsooosyhhhddddddmmNNNNmNNNmmmNNNmmdhhhdmmmNNNNmmmmmmmmmdddddddmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdddddhhhhhhhhhdmmNNNNNNNNNNNNNNNNNNNNNNNNNNM
mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmyooooohmNmmNdsoooooosoohNNNNNmysoooohmdddhdhddddmmmmNNNNmNNNNNNNmmdhhdmmmNNNmmNmmmdddddmmmmNNNNNNNmmmmmmmmmddddddddddddddhhhhhhhhhhhdddmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
mmmmNmmNNNmmmNmNNmmNNNmmNNNNNNNNhoooooohmNNNhsydhsosddyymNNNmyoooooymNNNmmmmmdddddddmmmmmmNNNNNNNNmdhhddmmmmmmdddddddmmNNNNNNNmmmmdddddddddddddddddddddddddmmmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
mmmNNNNNNNNmNNNNNNmNNmmNmNNNNNNNmyooooooyNNmyydhsoooyhdydNNmyoooooohNNNNNNNNNNNmmmmmmmdddmmmmNNNNNNmddddhhdddddddmmmNNNNNmmmmdddmmmmmmmmNNNNNNNNNNmmNNNmmmmNNNNNNNNmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
mmmmNNmmNmmmNNmmmmmNNmmNNNNNNNNNNhooooooohmdsos++osssossyNNyoooooosmNNNNNNNNNNNNmNNNNNNmmmdddmmmNNNNNmmmddddmmmmNNNNNNNmmddmmmNNNNNNNNNNNNNmmmmmmmmmdddddmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
mNNNNNNNNNNNNNNNNNmNNNNNNNNNNNNNNmsooooooshhss/--:+s:-:ohdhooooooohNNNNmmmNNNNmmmmmmNNNNNmmmddddmNNNNmmddddddmNNNNNNmmdddmmmNNNNNNmmmmmmmmddmmmmmmddddddddddhhdddmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNhooooooosys+--://oo/-:yhsoooooosdNNNNNNmmmdddddddddddddddddhhdmNNmmdddmmddddmNNNNNmddddmmmmdddddddddmmmmmmmmNNNNNNNmmmNNmmmmdhhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdsoooooossy/--:ho+dy:-oyoooooooymNNNNNmdddddddddddddddddddddmmmmmddddddddddddmmmmmmmmmddddmmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNNmdhhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNyoooooossso-:-::o+--:sssoooooohNNNNNNmdhddmNNNNNNNNNNNNmmmmmdddhyyyhhdmmmdddddmmmmmdmmmmmmmmmmmmmmmmmNNNmmNNNNNmNNmmmmmdddhhhdmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdoooooososs/---/s/::oyssooooosmNNNNNNmmddddmmNNNNNNNmmmdddhyyhddyyyyydNNmddddmmmNNmmmmmmddddddddddddddddddddddhhddhdhhhhdddmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmsooooosshyso++sssoosdhosooooyNNNNNNNmmmmddddddddddddddddyyyyyyhhyyyyhNNmmdddhdmmNNNNNNNmmmmmmdddddddhyyhhhyhhdhhhddmddmmNNNNNNNNNNMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmyooooooohdysoooooosddsoooooohNNNNNNNNNNNNmmmmddmmmmmmmmNmhyyyyyhyysyhdmmddhhhdmNNNNNNNNNNNNNNNNNNNNNy+os+oo+soo+oossoossyysssyhhhhhmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmdhsooooooshdhyysyyhdhsooooooodNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmhyyyhyssys+odddddmmNNNNNNNNNNNNNmmmmmmmmmsoys+syoysso++sooyo++++++++++oshmmmmmmmNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmddyooooooooshhdddhhyoooooooosmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmyyhhhyyhyhohNNNNNNNNNNNNNNNNNmdddddddddyoossy+/::/ssoo+///oys+++oo++shhyydmdddddmNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmdyooooooooooossssooooooooooymNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdsoshdyyyyhysdNNNNNNNNNNNNNNNmdhdmNNNNNmoosymd+::::odho:::::oo++++++ohddyshNNNmdhdNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNhsooooooooooooooooooooooooyddddmNNNNNNNNNNNNNNNNNNNNNNNNNNNhysodhyhddmdsshmNNNNNNNNNNNNmdddmNNNNNmo+sdhs::::+dmho:::::o++++++ssshhsssdNNmddmNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdsooooooooooooooooooooooooohmmddmNNNNNNNNNNNNNNNNNNNNNNNNNNNNmmNmmNNNNNNmhsydNNNNNNNNNNNmmmmmmmNNy+ssss+/:::sss+:::::+o+++++ssssssssyhddddmNNMMNMMMMMMNNMMMMMMNNMMM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmyoooooooooooooooooooooooooooydddNNNNNNNNNNNNNNNNNNNNNNNNNNNNNMMNNNNNNNNNNNNdyshmNNNNNNNNNNNNmmmmdo+osoooooo+s+::::/+osoo+++ossyhssyhddmmNNNMMMNMMMMMMMMMMMMMMMMNMMM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmyoooooooooooooooooooooooooooooymNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdyyhmNNNNNNmmmmmmmdo++++oooossooo+++oys++o++syssyysydNNNNMMNMMMMMMMMMMMMMNMMMMMMMMMMM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNhooooooooooooooooooooooooooooooohNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmhsydmNNmmmmmmmmh++++++osoo++++ooosoo++++syhhysshNMNNMMMMNMMMMMMMMNNNNNNMMMMMMMMMMM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmsooooooooooooooooooooooooooooooosdNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmhyyhdyssdmNms+so+++ss/+yyo/ss+++++++oyhddyshmMNMNNNNNNMNNNNNNNNNNNNNNNNNNNMNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNhooooooooooooooooooooooooooooooooosmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmyoyo:osdms+o++++ooooyyooso+++osoosyyhysdNNNNMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmyoooooooooooooooooooooooooooooooooohNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNds+:://+ssoss+++oooooooo++++oyyosssssshNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNMMNNNNNNNNNNNNNNNNNNNNNNNNNNNNmsooooooooooooooooooooooooooooooooooymNMNMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdhys++oosys+++++++++o++++++o+sysyhyhmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNMMMMNNNMMMNNNNNMMMMMMNNMNNNMMNNyoooooooooooooooooooooooooooooooooyhNNNNNNNNNNNNMNNNNNNNNMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNdooo++++++++++++++++o+oyyo+shNMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNM
NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNhysooooooooooooosssssoooooooooosyhhhmmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmo++osoosoo++++++++oo+syo+osmNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNmNNNNNNNN
NNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmhyyyyssooooooooooosoooooooossyyhyysyysyyhdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmo++/oooohdysooss++oosyy+++ymmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmN
mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdhhhhossyyyyhyysssssssssssssyyhhyyyssoshsosssoyNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmNmdhdhhddyshys+++++ysydyyNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmN
mmmmmmmmmmmmmmmmmmmmmmmmmmmmdyyysyhyosssssssyhyhhhhhhhyyyyyyhyoosssssssyyysshNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmddddmmmmmmmmmmdddmmmhdmmddmmmmddmmNNssNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
dmmmmmmmmmmmmmmmmmmmmmmmmmmdyssyyhyssssssssosyyyyyysssssyyyyysosssssssyyooooshdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmdmmmmmmmmmmdmmdmdddddhdmmmddddmmmmddddmdmddmmmmssmmmdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
ddddddddddddddddddddddddddysoooosyysssssssssossssyysyssyyssssssssssssyyoooooooydmdddddmddmddmddmdddddddmmdmddmddddddddddmmNNyoyyyhhhdddmmmmmmmmdddddddddmmmmmsohddmddddddddddddddddddddddddddddddddddddm
dhddddddddddddddddddddddhsooooooooyyosssssssssoossyyyyyssssssyydhssooysoooooooohdddddddmmmdhddmdddddmmmdhhhdmmmddddddddddmmmdddddmdmdmhddddhhysyhmmmmmdddddddooo+yhddddddddddddddddddddddddddddddddddddm
hhhdddddddhdddddddddddddyoooooooooshsosssyhdhyysssssssssyyhhddddddhysyhhyyyssyhddddhdddNNmddddmmddddmmmmmmNNNNNmdhdddddddhddddddddhmmNNyoyhhhddddddddddddddhyhddhyyhdddhhhdhhhhhhhhhddhddddddddddhhhdddm
hhhhhhhhhhhddhhhhhhhhhhdhyssssssyyyyssyhdddhhdddddddddddddhhhhdddddddddhhddddddhhdhhhdmNNNNNmmdhhhdmmmNNNMNNNNmdddhhhhhhhhhhhhhhhhhhdmdddhhhhhhhhhhhhhhhhhhdddhhhhddhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdm
hhhhhhhhhhhhhhhhhdhhhhhhhhhhhhhhhhddddhhhhhhhhhhhhhhhhhdhhhhhhhhhhddhhhhhhhddhhhhhddddddddddddddmmNNNMNMMNmddmddmmdhhhdhhhhhhhhhhhhhhhhhhhhhhdhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdm
hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdhhhhhhhhhhhhhdmNNmddddmmNNNNNNNMMMNNNNmmdddmdmmmdhhhhhhhhhhhhhhhhhhhhhhhhyhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhd
hhhhhhhhhhhhhhhhy/:::::::/+yhhh+::::::::+hhhs/:.-.-:+yhh+:::::::::::ohy/::::::+dddNo/::+mNm+///yNNNdo/---:/smNmms///:/hhhhs::::::::/hhyo:-...-/oyhh+:::::yo:::::ss:::::ss:::::oy:::::+hhhhhhhhhhhhhhhhhd
hhhhhhhhhhhhhhhhy`         `/hh:        :hy:    `    `/h-           /h+       `hhhm-    +Nm`   +Nm/`   ``   `sNM/    `hdhh+        .ys.    `    .yh/    `y+     so     os     +y`    /hhhhhhhhhhhhhhhhhd
yyhhhhhhhhhhhhhhy`    -/`   `sh:    `///oy/    `y+    `yo++:     ://sh:        ohhh-    `yd`   /Ny     so    `dN/    `dddd+     ///+y:    -s.    +y+    `yo    `ys`    sy`    oy.    +hhhhhhhhhhhhhhhhhd
hhhhhhhhhhhyyhhhy`    /y`    oh:    .yyyyh:    .my     sddd+    `shhhh.   -.   /mmd-     .y`   /d+     yy`    sd/    `hhhh+     yhhhh:    -s+/://sho    .ys    `ys`    yh`    oy.    +hyyyyyyyyyyhhhhhhd
yyyyhyyyyhhyhhhhy`    -/`   .yy:    `:::sh:    .dy`````ohhh+    `syhys    /:   .dmd-      :`   :h+    `yy+o+++sd:    `hhhh+     -::+yo`    `-+yyyhhs`   .ys`   .yy`   `yy.    sy-    ohyhhhyyyyhhhyyyhhd
yyyyhhhhhhyyyyyys`        `-syy:        +y:    .yyyyysyyhyy/    `oyyh/    s+    ohy.           :h+    `o/::://ym/    `yhhy/        :yyo:`     `:oyys`   -ys.   .yy.   `yh-   `yy:   `syyyyyyyyyyyyyyyyyd
yyyyyyyyyyyyyyyhy`    -/`   .yy:    `///oy:    .ys+++ooyyyy+    `oyhy-   `yo`   /hh-   ``      :y/     +.     +h:    `yyhh+     ///oyyyyy+-`    `+ys`   :yy.   -yy-   .yy:   .yy/   `syyyyyyyyyyyyyyyyyd
yyyyhhyyyyyyhhhys`    /y`    sh:    .yyhhy:    .yo`    +yyy+    `syys`   `--    .yy.   -+      :h+     os`    +y:    `yyyh+     syyyy+----+s-    .yy.   /yy-   :yy:   -yy:   .yy/   .syyyyyyyyyyyyyyyyyd
yyyyhhhhhhhyyyyys`    /y`    oy:    .yyyyy:    .yo    `oyyy+    `syy+           `ss.   .y.     :y+     sy`    +y:    `yyyy+     oyyyy/    -y+    `yy/:::oyy/:::oyy+:::+yyo:::/yyo:::/yyyyyyyyyyyyyyyyyyd
yyyyyyyyyyyyyyyys`    /y`    oy:        `yo`    -.    -yhhy+    `syy:    .oo-    /y.   .y+     :ys`    --     +y:       `o/         oo`   `-.    -yo`   .ss`   .yy`   `sy.    sy-    oyyyyyyyyyyyyyyyyhd
ssyyyyyyyyhyyhhhs.    :s.   `oy:        `syo-`      ./yyhhy/`   `syy.    -yy:    .y-   .yy-    :yys:`    .-   +h:       `o+`       `oyo-`      `:syo`   .yo`   .ss`   `sy.    sy-    oyyyyyyysyyyyyyyyyd
ssyyhhhhhhhhhhyyyssssssysssyyyyysssssssssyyyyys+oooyyyhyyyyyyyyssysyyyysssyyyyyyssyyyyysyyyyyyssyyyyyo+osyysssyhysssssssyyyyyssssssyyyyyysoooosyyyyyssyyyyssysssyyssyyyyysssssyysssssyyyyyyyyyyysyyyyyyh
ssyhhhhhyyyyyyyyyyyyyyyyyhhyyyyyyyyyyyhhhhhyyyyyyhhyyyhyyyhyyyyyyyyyhhyyyyyyyhhhyyyhyyyyyyyhhyyyyyyyhyyyyhhyyyyyhhyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyhyhhhhyyyyyyyyyyyyyyyyyyyyyyyyyyyhhyyyyhyyyyyd
yhddddddhhhhhhddddddddddddddhhhhhddddddddddddddddddddddddddddhhddhddddddddddddddddddddddddddddhhhhddddddddddddhhddddddhhhhddddddhhhdddddhhhhhhddddddhhhhhhhddddddddddddhhhdddddddhhhhhhhhhhddhhhhhhhhdhm
 */
