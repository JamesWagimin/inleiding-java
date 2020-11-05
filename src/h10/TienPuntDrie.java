package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntDrie extends Applet {
    TextField vak;
    Label label;
    String s, text;
    int maand;

    public void init() {
vak = new TextField("",10);
label = new Label("typ het maandnummer");
vak.addActionListener(new VakListener());
text ="";

add(label);
add(vak);

    }

    public void paint(Graphics g) {
        g.drawString(text,50,100);

    }

   class VakListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           s = vak.getText();
           maand = Integer.parseInt(s);

           switch (maand){
               case 1:
                   text = "januari heeft 31 dagen";
                   break;
               case 2:
                   text = "februari heeft 28 dagen";
                   break;
               case 3:
                   text = "maart heeft 31 dagen";
                   break;
               case 4:
                   text = "april heeft 30 dagen";
                   break;
               case 5:
                   text = "mei heeft 31 dagen";
                   break;
               case 6:
                   text = "juni heeft 30 dagen";
                   break;
               case 7:
                   text = "juli heeft 31 dagen";
                   break;
               case 8:
                   text = "augustus heeft 31 dagen";
                   break;
               case 9:
                   text = "september heeft 30 dagen";
                   break;
               case 10:
                   text = "october heeft 31 dagen";
                   break;
               case 11:
                   text = "november heeft 30 dagen";
                   break;
               case 12:
                   text = "december heeft 31 dagen";
                   break;
               default:
                   text = "Er zitten maar 12 maanden in een jaar";
                   break;
           }
           repaint();

       }
   }

}
