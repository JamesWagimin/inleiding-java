package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt4 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        int f1 = 0,y=0;


        while(f1 <= 30){
            y+= 15;
            g.drawString(Integer.toString(f1),10,y );
            f1+= 3;

        }

    }
}
