package h12;

import java.applet.Applet;
import java.awt.*;

public class ZTwaalfTest2 extends Applet {
    boolean gevonden;
    String[] salaris = { "naam1","naam2", "naam3" };
    String gezocht;

    public void init() {
        gezocht = "naam3";
        gevonden = false;
        int teller = 0;
        while(teller < salaris.length) {
            if(salaris[teller] == gezocht) {
                gevonden = true;
            }
            teller ++;
        }

    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }

    }
}
