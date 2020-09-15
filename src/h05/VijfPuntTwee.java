package h05;

import java.applet.Applet;
import java.awt.*;

public class VijfPuntTwee extends Applet {

    int gewichtValerie, yasVal,minasVal,heightVal;
    int gewichtJeroen,yasJer,minasJer,heightJer;
    int gewichtHans,yasHans,minasHans,heightHans;
    int xasgrafiek;

    @Override
    public void init() {
        xasgrafiek = 150;

        gewichtValerie = 60;
        minasVal = 100 - gewichtValerie;
        yasVal = 10 + minasVal * 5 ;
        heightVal = 510 - yasVal;

        gewichtJeroen = 20;
        minasJer = 100 - gewichtJeroen;
        yasJer = 10 + minasJer * 5;
        heightJer = 510 - yasJer;

        gewichtHans = 60;
        minasHans = 100 - gewichtHans;
        yasHans = 10 + minasHans * 5;
        heightHans = 510 - yasHans;





    }

    @Override
    public void paint(Graphics g) {

        //valerie 40kg jeroen 100kg hans 80kg
        g.setColor(Color.black);
        g.drawRect(xasgrafiek,10,500,500);
        //body

        g.fillRect(xasgrafiek,110,500,1);
        g.drawString("80",120,110);

        g.fillRect(xasgrafiek,210,500,1);
        g.drawString("60",120,210);

        g.fillRect(xasgrafiek,310,500,1);
        g.drawString("40",120,310);

        g.fillRect(xasgrafiek,410,500,1);
        g.drawString("20",120,410);
        //lines

        g.drawString("Gewicht in KG",10,500);


        g.drawString("Jeroen",375,550);
        g.drawString("Valerie",235,550);
        g.drawString("Hans",545,550);

        g.setColor(Color.green);
        g.fillRect(360,yasJer,75,heightJer);
        //jeroen

        g.setColor(Color.red);
        g.fillRect(220,yasVal,75,heightVal);
        //valerie

        g.setColor(Color.magenta);
        g.fillRect(520,yasHans,75,heightHans);
        //hans

    }
}
