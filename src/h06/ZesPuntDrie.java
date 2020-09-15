package h06;

import java.applet.Applet;
import java.awt.*;

public class ZesPuntDrie extends Applet {
    int ahaha,nee,dankje;

    @Override
    public void init() {
        ahaha = 3;
        nee = 7;
        dankje = ahaha - nee;


    }

    @Override
    public void paint(Graphics g) {



        String dankjeString = ahaha + " - " + nee + " = " + dankje ;
        g.drawString(dankjeString,10,10);


    }
}
