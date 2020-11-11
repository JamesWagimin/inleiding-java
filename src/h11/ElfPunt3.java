package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt3 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        int fn, x, f1 = 0, f2 = 1;
        x=0;

        for (fn = 2;fn < 144;) {
            fn = f1 + f2;
            x += 20;
            g.drawString(Integer.toString(fn),x,10);
            f1 = f2;
            f2 = fn;
        }


    }
}
