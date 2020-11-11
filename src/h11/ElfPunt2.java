package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt2 extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {
        int teller=20, y=0;
        String s;

while(teller >= 10) {
y += 20;
g.drawString(Integer.toString(teller),10, y );
teller--;
}

    }

}
