package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntDrie extends Applet {
    TextField vak, vak2;
    Label label, label2;
    String s, text,s2, text2, schrik, line;
    int maand, jaar;
    Button button;

    public void init() {
vak = new TextField("",2);
label = new Label("maandnummer");
vak2 = new TextField("",4);
label2 = new Label("jaar: ");
button = new Button("check");

vak.addActionListener(new VakListener());
vak2.addActionListener(new Vak2Listener());
button.addActionListener(new ButtonListener());
text ="";
text2="";


add(label2);
add(vak2);
add(label);
add(vak);
add(button);

    }

    public void paint(Graphics g) {
        g.drawString(text,50,100);
        g.drawString(text2,50,120);


    }
    class Vak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = vak2.getText();
            jaar = Integer.parseInt(s2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) || jaar % 400 == 0) {
                schrik = " 29 ";
                text2 = "het is een schrikkeljaar";
            } else {
                schrik = " 28 ";
                text2 = "het is geen schrikkeljaar";

            }
        }
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
                   text = "februari heeft" + schrik + "dagen";
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
       }
   }
   class ButtonListener implements ActionListener{
       public void actionPerformed(ActionEvent e) {
line= text + text2;
repaint();
       }
   }

}
