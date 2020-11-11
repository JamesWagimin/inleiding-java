package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt1 extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {
int x=0, teller=0;
while(teller < 11) {
    x += 20;
    g.drawLine(x , 50, x, 300 );
    g.drawString("" + teller, x-5, 315 );
    teller++;


        }

    }

}
