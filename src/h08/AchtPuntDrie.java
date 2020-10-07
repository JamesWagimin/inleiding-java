package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AchtPuntDrie extends Applet {


    double belastingvrij;
    TextField vak;
    Button rekenen;
    Label label;

    public void init() {


        belastingvrij = 0;
        label = new Label("€");
        rekenen = new Button("Uitrekenen");
        vak = new TextField("",20);

        rekenen.addActionListener(new btw());

        add(label);
        add(vak);
        add(rekenen);
    }

    public void paint(Graphics g) {
        g.drawString("Bedrag inclusief BTW: " + belastingvrij,50,60);
    }

    class btw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String haha = vak.getText();
            belastingvrij = Double.parseDouble(haha);
            belastingvrij *= 1.21;
            repaint();

        }
    }
}
