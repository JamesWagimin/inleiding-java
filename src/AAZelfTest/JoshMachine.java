//package AAZelfTest;
//
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class JoshMachine extends Applet {
//    Label label;
//    TextField vak;
//    String aapje, s;
//
//    public void init() {
//        setSize(640,640);
//
//label = new Label("Josh heeft een: ");
//vak = new TextField("", 5);
//
//vak.addActionListener(new Giravv());
//
//add(label);
//add(vak);
//
//    }
//
//    public void paint(Graphics g) {
//        g.drawString(aapje,10,10);
//
//
//    }
//
//    class Giravv implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//
//
//            switch(s){
//                case 1:
//                    aapje = "Josh is gay";
//                    break;
//                case 2:
//                    aapje = "Josh is zeker niet gay";
//                    break;
//                case 3:
//                    aapje = "Josh gaat nu zijn school niet halen";
//                    break;
//                case 4:
//                    aapje = "Josh is een echte goede student en gaat nu nu op dit moment naar de fucking universiteit";
//                    break;
//                case 5:
//                    aapje = "Josh is pansexueel";
//                    break;
//            }
//            repaint();
//            System.out.println(aapje);
//
//        }
//    }
//
//
//}
