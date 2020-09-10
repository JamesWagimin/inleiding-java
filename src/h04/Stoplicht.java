package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRoundRect(10,10,100,200,160,90);
        g.fillRoundRect(15,15,90,190,160,90);
        //base

        g.setColor(Color.red);
        g.fillOval(35,30,50,50);

        g.setColor(Color.yellow);
        g.fillOval(35,85,50,50);

        g.setColor(Color.green);
        g.fillOval(35,140,50,50);


    }
}
