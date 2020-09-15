package h06;

import java.applet.Applet;
import java.awt.*;

public class ZesPuntEen extends Applet {

    double a, b, uitkomst;



    @Override
    public void init() {

        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Jan krijgt :" + uitkomst, 10, 10);
        g.drawString("ALi krijgt :" + uitkomst, 10, 25);
        g.drawString("Jeanette krijgt :" + uitkomst, 10, 40);
        g.drawString("James krijgt :" + uitkomst, 10, 55);


    }
}
