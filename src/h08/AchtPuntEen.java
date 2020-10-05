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
        KnopListener listenOkay = new KnopListener();
        KnopListener listenReset = new KnopListener();

        knopOkay.addActionListener(listenOkay);
        knopReset.addActionListener(listenReset);
        add(tekstvakje);
        add(knopOkay);
        add(knopReset);
        schermtekst = "";




    }


    @Override
    public void paint(Graphics g) {




    }


    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst = "deze knop doet iets";
        }
    }



}
