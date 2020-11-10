package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntVijf extends Applet {

    TextField vak;
    Label label;
    Button button;
    double input, gemiddelde, tussen, tussen2;
    String s, t;

    public void init() {
        vak = new TextField("", 5);
        label = new Label("voer hier je cijfer in -> ");
        button = new Button("Check");
        button.addActionListener( new Buttonlistener());

        add(label);
        add(vak);
        add(button);


    }


    public void paint(Graphics g) {

g.drawString(t, 10 ,100);
g.drawString("je gemiddelde is " + tussen,10,200);

    }

    class Buttonlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
          s= vak.getText();
          input = Double.parseDouble( s);


//          tussen = Double.parseDouble(s);
//          gemiddelde = (cijfer + tussen) / 2;


          if (input >= 5.5 ) { t= "Je hebt een voldoende";

          } else { t= "Je hebt een onvoldoende";
        }
          vak.setText("");

          repaint();
    }


    }


}