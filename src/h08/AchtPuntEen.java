package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AchtPuntEen extends Applet {
    TextField tekstvakje;
    Button knopOkay, knopReset;
    String schermtekst;

    @Override
    public void init() {
        tekstvakje = new TextField("klik hier", 20);
        knopOkay = new Button("enter");
        knopReset = new Button("reset");
        knoplistener1 ab = new knoplistener1();
        knoplistener2 cd = new knoplistener2();
        knopOkay.addActionListener(ab);
        knopReset.addActionListener(cd);

        add(tekstvakje);
        add(knopOkay);
        add(knopReset);
        schermtekst = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(schermtekst,60,80);
    }

    class knoplistener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvakje.getText();
            repaint();
        }
    }


    class knoplistener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvakje.setText("");
            repaint();
        }
    }

}
