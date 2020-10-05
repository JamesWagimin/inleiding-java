package h06;

import java.applet.Applet;
import java.awt.*;

public class ZesPuntPraktijk extends Applet {


    int  d, placeholder2;
    double a, b, c, tussen, placeholder, placeholder3, gemiddelde;


    @Override
    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        placeholder = (a + b + c) / d;
        tussen = placeholder * 10;
        placeholder2 = (int) tussen;
        placeholder3 = placeholder2;
        gemiddelde = (placeholder3 / 10);








    }

    @Override
    public void paint(Graphics g) {

        String midstring= "("+a + " + " + b + " + " + c+ ")" + " : " + d + " = " + gemiddelde;
        g.drawString(midstring, 10,10);

        g.drawString(String.valueOf(gemiddelde),10,30);

    }
}
