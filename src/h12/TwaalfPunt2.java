package h12;

import java.applet.Applet;
import java.awt.*;

public class TwaalfPunt2 extends Applet {

    Button Buttons[] = new Button[25];

    public void init() {
        for (int i = 0; i != 25; i++) {
            Buttons[i] = new Button("Knop " + (i + 1));
            add(Buttons[i]);
        }


    }

    public void paint(Graphics g) {


    }
}
