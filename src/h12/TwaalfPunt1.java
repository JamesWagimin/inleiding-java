package h12;

import java.applet.Applet;
import java.awt.*;

public class TwaalfPunt1 extends Applet {
int[] getallen = {15, 12, 14, 13, 18, 19, 17, 21, 23, 9};
int aantal, grenswaarde;

    public void init() {
aantal = 0;
grenswaarde = 10;


    }

    public void paint(Graphics g) {

    int y = 50;

    for (int i = 0; i < getallen.length; i++){
        g.drawString("Op nummer " + i + "staat: ", 50 ,y);

    }

    }
}

//300, 100
//500, 100
//100, 400
//100, 400