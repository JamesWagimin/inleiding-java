package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DertienPunt3 extends Applet {
    Button baksteenbutton, betonbutton;
    Label baksteenlabel, betonlabel;
    Boolean bool1 = false , bool2 = false;


    public void init() {
        setSize(800, 800);


        baksteenbutton = new Button("baksteen");
        betonbutton = new Button("beton");
        baksteenlabel = new Label("klik voor baksteen muur");
        betonlabel = new Label("klik voor betonnen muur");

        baksteenbutton.addActionListener(new steenlistener());
        betonbutton.addActionListener(new betonlistener());


        add(baksteenlabel);
        add(baksteenbutton);
        add(betonlabel);
        add(betonbutton);


    }

    public void paint(Graphics g) {
if (bool1) {
    if (bool2){
        BaksteenMaker(g,10,10,25,10);
    }else{
        betonmakerMaker(g,20,20,45,20);
    }
}


    }


    public class steenlistener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            bool1 = true;
            bool2 = true;
            repaint();
        }
    }

    public class betonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bool1 = true;
            bool2 = false;
            repaint();
        }

    }
    public void BaksteenMaker(Graphics _g, int rijaantal, int kolomaantal, int breedte, int hoogte) {
        for (int kolom = 0; kolom < kolomaantal; kolom++) {
            for (int rij = 0; rij < rijaantal; rij++) {
                if (rij % 2 == 0) {
                    _g.setColor(Color.orange);
                    _g.fillRect(kolom * breedte + (int) (0.5 * breedte), rij * hoogte, 20, 10);
                } else {
                    _g.fillRect(kolom * breedte, rij * hoogte, 20, 10);
                }
            }
        }
    }

    public void betonmakerMaker(Graphics _g, int _rijaantal, int _kolomaantal, int _breedte, int _hoogte) {
        for (int kolom = 0; kolom < _kolomaantal; kolom++) {
            for (int _rij = 0; _rij < _rijaantal; _rij++) {
                if (_rij % 2 == 0) {
                    _g.setColor(Color.gray);
                    _g.fillRect(kolom * _breedte + (int) (0.5 * _breedte), _rij * _hoogte, 40, 20);
                } else {
                    _g.fillRect(kolom * _breedte, _rij * _hoogte, 40, 20);
                }
            }
        }
    }



}
