package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        g.fillArc(10,10,100,75,180,360);

    }
}
