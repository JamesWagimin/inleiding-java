package h08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class AchtPuntTwee extends Applet {


    TextField vak;
    Button manKnop;
    Button vrouwKnop;
    Button potManKnop;
    Button potVrouwKnop;

    String stringMan;
    double doubleMan;
    String stringVrouw;
    double doubleVrouw;
    String stringPotMan;
    double doublePotMan;
    String stringPotvrouw;
    double doublePotVrouw;
    String stingTot;
    double doubleTot;

    public void init() {

        doubleMan = 0;
        stringMan = Double.toString(doubleMan);
        doubleVrouw = 0;
        stringVrouw = Double.toString(doubleVrouw);
        doublePotMan = 0;
        stringPotMan = Double.toString(doublePotMan);
        doublePotVrouw = 0;
        stringPotvrouw = Double.toString(doublePotVrouw);
        doubleTot = 0;
        stingTot = Double.toString(doubleTot);


        manKnop = new Button("Mannelijke Studenten");
        vrouwKnop = new Button("Vrouwelijke Studenten");
        potManKnop = new Button("Potentiele Mannelijke Studenten");
        potVrouwKnop = new Button("Potentiele Vrouwlijke Studenten");
        vak = new TextField("",5);


        manKnop.addActionListener(new Man());
        vrouwKnop.addActionListener(new Vrouw());
        potManKnop.addActionListener(new PMan());
        potVrouwKnop.addActionListener(new PVrouw());


        add(manKnop);
        add(vrouwKnop);
        add(potManKnop);
        add(potVrouwKnop);
        add(vak);
    }

    public void paint(Graphics g) {
        g.drawString("Mannelijke Studenten: ",50,160);
        g.drawString("Vrouwlijke Studenten: ",50,180);
        g.drawString("Potentiele Mannelijke Studenten: ",50,200);
        g.drawString("Potentiele Vrouwelijke Studenten: ",50,220);
        g.drawString("Totaal: ",50,240);
        g.drawString(stringMan,190,160);
        g.drawString(stringVrouw,190,180);
        g.drawString(stringPotMan,260,200);
        g.drawString(stringPotvrouw,260,220);
        g.drawString(stingTot,97,240);

    }

    class Man implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringMan = vak.getText();
            doubleTot = Double.parseDouble(stringMan)+Double.parseDouble(stringVrouw)+Double.parseDouble(stringPotMan)+Double.parseDouble(stringPotvrouw);
            stingTot = Double.toString(doubleTot);
            repaint();
        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringVrouw = vak.getText();
            doubleTot = Double.parseDouble(stringMan) + Double.parseDouble(stringVrouw) + Double.parseDouble(stringPotMan) + Double.parseDouble(stringPotvrouw);
            stingTot = Double.toString(doubleTot);
            repaint();
        }
    }

    class PMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringPotMan = vak.getText();
            doubleTot = Double.parseDouble(stringMan) + Double.parseDouble(stringVrouw) + Double.parseDouble(stringPotMan) + Double.parseDouble(stringPotvrouw);
            stingTot = Double.toString(doubleTot);
            repaint();
        }
    }

    class PVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringPotvrouw = vak.getText();
            doubleTot = Double.parseDouble(stringMan) + Double.parseDouble(stringVrouw) + Double.parseDouble(stringPotMan) + Double.parseDouble(stringPotvrouw);
            stingTot = Double.toString(doubleTot);
            repaint();
        }
    }


//:( te lang mee bezig geweest :(

}
