package h13;

import java.applet.Applet;
import java.awt.*;

public class DertienPunt2 extends Applet {

    public void init() {
        setSize(500,500);


    }

    public void paint(Graphics g) {
        MuurMaker(g,10,10,25,10);

    }

    public void MuurMaker(Graphics _g, int rijaantal, int kolomaantal, int breedte, int hoogte){
        for(int kolom = 0; kolom < kolomaantal; kolom++){
            for(int rij = 0; rij< rijaantal; rij++) {
                if (rij % 2 == 0) {
                    _g.setColor(Color.orange);
                    _g.fillRect(kolom * breedte + (int) (0.5 * breedte), rij * hoogte, 20, 10);
                } else {
                    _g.fillRect(kolom * breedte, rij * hoogte, 20, 10);
                }
            }

    }

}

}