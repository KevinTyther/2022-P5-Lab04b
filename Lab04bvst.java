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
        g.drawRect(200,130,175,175);
        g.drawRect(250,180,175,175);
        g.drawLine(200,130,250,180);
        g.drawLine(375,130,425,180);
        g.drawLine(200,305,250,355);
        g.drawLine(375,305,450,325);
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
        g.drawOval(800,425,150,150);
        g.drawLine(800,500,925,445);
        g.drawLine(800,500,875,575);
        g.drawLine(875,575,925,445);
        g.drawOval(827,477,70,70);
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
        g.fillRect(450,525,75,25);
        // S ^

        // DRAW PACMEN FLOWER
        g.fillArc(700,400,100,100,45,270);
        g.fillArc(575,400,100,100,225,270);
        g.fillArc(640,330,100,100,138,270);
        g.fillArc(640,470,100,100,318,270);

    }

}


