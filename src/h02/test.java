package h02;

import java.applet.Applet;
import java.awt.*;

public class test extends Applet {

    public void init() {
        ;setBackground(Color.white);
    }


    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("James", 50, 50 );
        g.setColor(Color.red);
        g.drawString("Wagimin", 50, 65);
    }


}
