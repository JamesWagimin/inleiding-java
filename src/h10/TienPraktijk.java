package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPraktijk extends Applet {
    TextField vak;
    Label label;
    int input;
    String s, rating;


    public void init() {
        vak = new TextField("",5);
        label = new Label("voer een cijfer van 1 tot 10 in");
        vak.addActionListener( new Vaklistener());
        add(label);
        add(vak);
        rating = "";

    }

    public void paint(Graphics g) {
g.drawString( rating,10, 50);

    }
    class Vaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = vak.getText();
            input = Integer.parseInt( s );

            switch (input){
                case 1: rating = "Je score is: slecht";
                    break;
                case 2: rating = "Je score is: slecht";
                    break;
                case 3: rating = "Je score is: slecht";
                    break;
                case 4: rating = "Je score is: onvoldoende";
                    break;
                case 5: rating = "Je score is: matig";
                    break;
                case 6: rating = "Je score is: voldoende";
                    break;
                case 7: rating = "Je score is: voldoende";
                    break;
                case 8: rating = "Je score is: goed";
                    break;
                case 9: rating = "Je score is: goed";
                    break;
                case 10: rating = "Je score is: goed";
                    break;
                default: rating = "Je getal klopt niet";
            }
            vak.setText("");
            repaint();

        }
    }


}
