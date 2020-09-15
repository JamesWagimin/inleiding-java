package h05;

import java.applet.Applet;
import java.awt.*;

public class VijfPuntEen extends Applet {


    Color bruh;
    Color kleur;
    int breed;
    int hoog;


    @Override
    public void init() {

        bruh = Color.yellow;
        kleur = Color.BLACK;
        breed = 100;
        hoog = 50;

    }

    @Override
    public void paint(Graphics g) {


        g.drawLine(10,10,110,10);
        g.drawString("Lijn", 40,20);

        g.drawRect(10,50,breed,hoog);
        g.drawString("rechthoek",30,115);

        g.drawRoundRect(10,130,breed,hoog,30,30);
        g.drawString("afgeronde rechthoek",10,200);

        g.drawString("gevulde rechthoek met ovaal",130,115);
        g.drawString("gevulde ovaal",155,200);
        g.drawString("taartpunt met ovaal eromheen", 300,120);
        g.drawString("cirkel",300,200);



        g.setColor(kleur);
        g.drawOval(300, 50, breed, hoog);


        g.setColor(bruh);
        g.fillRect(150,50,breed,hoog);
        g.fillOval(150,130,breed,hoog);
        g.fillArc(300, 50, breed, hoog, 0, 45);

        g.setColor(kleur);


        g.drawOval(150,50,breed,hoog);
        g.drawOval(300,130,50,hoog);

    }
}
