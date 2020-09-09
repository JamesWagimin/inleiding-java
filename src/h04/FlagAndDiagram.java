package h04;

import java.applet.Applet;
import java.awt.*;

public class FlagAndDiagram extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.fillRect(10,10,10,200);

        g.setColor(Color.white);
        g.drawRect(20,40,200,30);


        g.setColor(Color.red);
        g.fillRect(20,10,200,30);

        g.setColor(Color.blue);
        g.fillRect(20,70,200,30);
        //flag

        //valerie 40kg jeroen 100kg hans 80kg
        g.setColor(Color.black);
        g.drawRect(300,10,500,500);
        //body

        g.fillRect(300,110,500,1);
        g.fillRect(300,210,500,1);
        g.fillRect(300,310,500,1);
        g.fillRect(300,410,500,1);


    }
}
