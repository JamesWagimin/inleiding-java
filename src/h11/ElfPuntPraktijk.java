package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElfPuntPraktijk extends Applet {
    Button button;
    TextField vak;
    Label label;

    int input, output = 0, x = 10, y, tel = 0;
    String s;

    public void init() {
button = new Button("OK");
vak = new TextField("",5);
label = new Label("De tafel van: ");
vak.addActionListener(new vaklist());
button.addActionListener(new Buttonlist());
add(label);
add(vak);
add(button);


    }

    public void paint(Graphics g) {

        while(tel < 10) {
            tel+= 1;
            y+= 20;
            output+= input;
            g.drawString(tel + " X " + input + " = " + output, x, y);
        }

    }

    class vaklist implements ActionListener {
        public void actionPerformed(ActionEvent e) {


        }
    }

class Buttonlist implements ActionListener{
    public void actionPerformed(ActionEvent e) {
s = vak.getText();
output = Integer.parseInt(s);
repaint();

    }
}




}
