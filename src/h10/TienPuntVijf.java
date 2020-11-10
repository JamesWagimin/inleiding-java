package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntVijf extends Applet {

    TextField vak;
    Label label;
    Button button;
    double input, gemiddelde, tussen;
    String s, t, welniet;
    int intgemiddeld;

    public void init() {
        vak = new TextField("", 5);
        label = new Label("voer hier je cijfer in -> ");
        button = new Button("Check");
        button.addActionListener( new Buttonlistener());

        add(label);
        add(vak);
        add(button);

        gemiddelde = 0.0;
        tussen = 0;


    }


    public void paint(Graphics g) {

g.drawString(t, 10 ,100);
g.drawString("Je gemiddelde is " + gemiddelde,10,200);
g.drawString("Je bent " + welniet + " geslaagd",10,220);
    }

    class Buttonlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
          s= vak.getText();
          input = Double.parseDouble( s);

            gemiddelde = ((gemiddelde * tussen) + input) / (tussen + 1);
            gemiddelde =  gemiddelde * 10;
            intgemiddeld = (int) gemiddelde;
            gemiddelde =  intgemiddeld;
            gemiddelde = gemiddelde / 10;
            tussen++;
            if (gemiddelde >= 5.5){ welniet = "wel";
            } else welniet = "niet";


          if (input >= 5.5 ) { t= "Je hebt een voldoende";

          } else { t= "Je hebt een onvoldoende";
        }
          vak.setText("");

          repaint();
    }


    }


}