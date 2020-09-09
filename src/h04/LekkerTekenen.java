package h04;

import java.applet.Applet;
import java.awt.*;

public class LekkerTekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);
        g.setColor(Color.ORANGE);
        g.fillPolygon(new int[] {10,60,110}, new int[] {100,20,100}, 3);
        g.setColor(Color.BLACK);
        g.fillPolygon(new int[] {10,220,420}, new int[] {400,150,400}, 3);
        g.fillPolygon(new int[] {220,420,1000}, new int[] {150,400,150}, 3);
        g.fillPolygon(new int[] {420,1000,1300}, new int[] {400,150,400},3);
        g.setColor(Color.red);
        g.fillRect(100, 400,1100,400);
        g.setColor(new Color(50,0,0,200));
        g.fillRect(300,600,100,200);
        g.fillRect(145,445,110,110);
        g.setColor(Color.CYAN);
        g.fillRect(150,450,100,100);
        g.setColor(new Color(50,0,0,200));
        g.fillRect(150,500,100,5);
        g.fillRect(200,450,5,100);
        g.setColor(Color.yellow);
        g.fillOval(380,700,10,10);
        g.setColor(Color.GRAY);
        g.fillRect(500,500,600,300);
        g.setColor(Color.BLACK);
        g.fillRect(500,550,600,5);
        g.fillRect(500,600,600,5);
        g.fillRect(500,650,600,5);
        g.fillRect(500,700,600,5);
        g.fillRect(500,750,600,5);
        //huis




    }


}
