package h06;

import java.applet.Applet;
import java.awt.*;

public class ZesPuntTwee extends Applet {

    int minuut, uur, dag,jaar;

    @Override
    public void init() {
        minuut = 60;
        uur= minuut * 60;
        dag = uur * 24;
        jaar=dag*365;

    }

    @Override
    public void paint(Graphics g) {

        g.drawString("Hoeveel seconden in een:",10,10);
        g.drawString("Minuut     " + minuut,10,25);
        g.drawString("Uur          "+ uur,10,40);
        g.drawString("Dag         "+dag,10,55);
        g.drawString("Jaar         "+jaar,10,70);
    }
}
