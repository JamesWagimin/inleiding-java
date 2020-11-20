package h12;

import java.applet.Applet;
import java.awt.*;

public class ZTwaalfTest extends Applet {
    double salaris[];
    double[] kopie;
    double a;
    boolean aa;


    public void init() {
        a = 15750;
        aa = false;

        salaris = new double[6];
        kopie = new double[6];

        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 150 * (teller + 100);
        }

        for (int teller = 0; teller < salaris.length; teller ++) {
            kopie[teller] = salaris[teller];
        }
        salaris[3] = 1000;
    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            g.drawString("" + kopie[teller], 150, 20 * teller + 20);
        }
    }
}
