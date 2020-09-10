package h04;

import java.applet.Applet;
import java.awt.*;

public class Dice extends Applet {

    public void init() {

    }

    @Override
    public void paint(Graphics g) {

        g.drawRoundRect(10,10,300,300,90,90);

        g.fillOval(40,40,100,100);
        g.fillOval(180,40,100,100);
        g.fillOval(40,180,100,100);
        g.fillOval(180,180,100,100);




    }
}
