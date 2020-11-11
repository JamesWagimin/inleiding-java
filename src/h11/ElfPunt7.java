package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt7 extends Applet {

    public void init() {
setSize(960,1080);

    }

    public void paint(Graphics g) {
        int x=500, y=500, x2=5, y2=5;

        while(x2 < 500){
            x -= 5;
            y -= 5;
            x2 += 10;
            y2 += 10;
            g.drawOval(x,y,x2,y2);

        }

    }
}
