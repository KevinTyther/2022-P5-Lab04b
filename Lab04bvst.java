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
        g.drawOval(650,125,50,150);
        g.drawOval(663,125,25,150);
        g.drawOval(637,125,75,150);
        g.drawOval(625,125,100,150);
        g.drawOval(613,125,125,150);
        g.drawOval(600,187,150,25);
        g.drawOval(600,175,150,50);
        g.drawOval(600,160,150,75);
        g.drawOval(600,148,150,100);
        g.drawOval(600,136,150,125);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS
        g.fillRect(150,425,25,125);
        g.fillRect(150,475,50,25);
        g.fillRect(200,425,25,125);
        g.fillRect(150,425,50,25);
        // A ^
        g.fillRect(250,425,25,125);
        g.fillRect(250,425,75,25);
        g.fillRect(300,425,25,75);
        g.fillRect(250,475,50,25);
        // P ^
        g.fillRect(350,425,25,125);
        g.fillRect(350,425,75,25);
        g.fillRect(350,525,75,25);
        // C ^
        g.fillRect(450,425,75,25);
        g.fillRect(450,425,25,75);
        g.fillRect(450,475,75,25);
        g.fillRect(500,475,25,75);
        g.fillRect(500,525,75,25);
        // DRAW PACMEN FLOWER



    }

}


