// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawLine(300,125,375,125);
        g.drawLine(300,125,325,150);
        g.drawLine(300,125,300,200);
        g.drawLine(300,200,325,225);
        g.drawLine(325,150,325,225);
        g.drawLine(325,225,400,225);
        g.drawLine(400,225,375,200);
        g.drawLine(300,200,375,200);
        g.drawLine(375,200,375,125);
        g.drawLine(375,125,400,150);
        g.drawLine(325,150,400,150);
        g.drawLine(400,150,400,225);
        // DRAW SPHERE
        g.drawOval(600,125,150,150);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS
        g.fillRect(150,425,25,125);
        g.fillRect(150,475,50,25);
        g.fillRect(200,425,25,125);
        g.fillRect(150,425,50,25);
        // A ^
        g.fillRect(250,425,25,125);
        g.

        // DRAW PACMEN FLOWER



    }

}


