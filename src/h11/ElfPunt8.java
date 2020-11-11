package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt8 extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {
        int x=10, y=10, x2=10, y2=10;

        while(x2 < 1000){
            x2 += 10;
            y2 += 10;
            g.drawOval(x,y,x2,y2);

        }

    }

}
