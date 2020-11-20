package h13;

import java.applet.Applet;
import java.awt.*;

public class DertienPunt1 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        Driehoek(g, 0,200,400,200,200,10);

    }

    public void Driehoek(Graphics _g, int x1 , int y1, int x2, int y2, int x3, int y3 ){
        _g.drawLine(x1, y1, x2, y2);
        _g.drawLine(x2, y2, x3, y3);
        _g.drawLine(x3, y3, x1, y1);
    }




}
