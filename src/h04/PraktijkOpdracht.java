package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {

g.drawLine(10,10,110,10);
g.drawString("Lijn", 40,20);

g.drawRect(10,50,100,50);
g.drawString("rechthoek",30,115);

g.drawRoundRect(10,130,100,50,30,30);
g.drawString("afgeronde rechthoek",10,200);



        g.setColor(Color.BLACK);
        g.drawOval(300, 50, 100, 50);


g.setColor(Color.magenta);
        g.fillRect(150,50,100,50);
        g.fillOval(150,130,100,50);
        g.fillArc(300, 50, 100, 50, 0, 45);

        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal",130,115);
        g.drawString("gevulde ovaal",155,200);
        g.drawString("taartpunt met ovaal eromheen", 300,120);
        g.drawString("cirkel",300,200);


        g.drawOval(150,50,100,50);
        g.drawOval(300,130,50,50);









    }
}
