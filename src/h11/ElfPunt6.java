package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt6 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        int x=100, y=100, x2=30, y2=30;

        while(x2 < 90){
            x -= 5;
            y -= 5;
            x2 += 10;
            y2 += 10;
            g.drawOval(x,y,x2,y2);

        }

    }

}
