package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntEen extends Applet {

    TextField vak;
    Label label;
    String s, text;
    int cijfer, int2, int3=10000;

    public void init() {
        vak = new TextField("",10);
        label = new Label("typ een getal");
        vak.addActionListener( new vakListener() );
        text = "";

        add(label);
        add(vak);



    }

    public void paint(Graphics g) {
g.drawString("het grootste cijfer is "+int2, 50,100);
g.drawString("het laagste cijfer is "+int3, 50,120);

    }
    class vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = vak.getText();
            cijfer = Integer.parseInt( s);
            if(cijfer > int2){
                int2 = cijfer;
            }
            if(cijfer < int3){
                int3 = cijfer;
            }
            repaint();
        }
    }
}