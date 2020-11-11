package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt5 extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {
        int x=10, y=10;

        while(x <= 125){
            x+=25;
            y+=25;
            g.drawRect(x,y,25,25);

        }
    }

}
