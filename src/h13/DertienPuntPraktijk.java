package h13;

import java.applet.Applet;
import java.awt.*;

public class DertienPuntPraktijk extends Applet {

     public void init() {
setSize(900,900);

    }

    public void paint(Graphics g) {
Bos(g, 5,10,50,75 );

    }

    public void Boom (Graphics _g, int kolomaantal, int rijaantal){
               _g.setColor( new Color(153,102,0)) ;
        _g.fillRect(kolomaantal+5,rijaantal+20,20,75);

        _g.setColor(Color.green);
        _g.fillOval(kolomaantal+10, rijaantal+20, 30,30 );
        _g.fillOval(kolomaantal+15, rijaantal+20, 30,30 );
        _g.fillOval(kolomaantal+5, rijaantal+5, 30,30 );
        _g.fillOval(kolomaantal-13, rijaantal-15, 30,30 );
        _g.fillOval(kolomaantal-10, rijaantal+10, 30,30 );
        _g.fillOval(kolomaantal+15, rijaantal-15, 30,30 );
        _g.fillOval(kolomaantal+15, rijaantal, 30,30 );
        _g.fillOval(kolomaantal-10, rijaantal, 30,30 );
        _g.fillOval(kolomaantal, rijaantal-10, 30,30 );
        _g.fillOval(kolomaantal, rijaantal+10, 30,30 );


    }

 public void Bos (Graphics _g, int rijaantal, int kolomaantal, int tussenboomx, int tussenboomy){
            for(int kolom = 0; kolom < kolomaantal; kolom++){
                for(int rij = 0; rij< rijaantal; rij++) {
                    if (rij % 2 == 0) {
                        Boom(_g,kolom * tussenboomx, rij * tussenboomy);
                    } else {
                        Boom(_g,kolom * tussenboomx, rij * tussenboomy);
                    }
                }

            }

        }

    }



