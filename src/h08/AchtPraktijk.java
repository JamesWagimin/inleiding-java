package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AchtPraktijk extends Applet {

    TextField vak1, vak2;
    Button add, subtract, multiply, divide;
    Double T1, T2, Uitkomst;
    String SUitkomst;


    public void init() {
        //screensize
        setSize(960,1080);

        //numbers
        T1 = 0.0;
        T2 = 0.0;
        Uitkomst = 0.0;
        SUitkomst = "";

        //buttons
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");

        //textvak
        vak1 = new TextField("",20);
        vak2 = new TextField("",20);

        //listeners
        add.addActionListener(new addListener());
        subtract.addActionListener(new subListener());
        multiply.addActionListener(new multiListener());
        divide.addActionListener(new divListener());

        //add
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(vak1);
        add(vak2);

    }

    public void paint(Graphics g) {
    }

class addListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        T1 = Double.parseDouble(vak1.getText());
        T2 = Double.parseDouble(vak2.getText());
        Uitkomst = T1 + T2;
        SUitkomst = String.valueOf(Uitkomst);
        vak1.setText(SUitkomst);
        vak2.setText("");
        SUitkomst = String.valueOf(Uitkomst);

    }
}

class subListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        T1 = Double.parseDouble(vak1.getText());
        T2 = Double.parseDouble(vak2.getText());
        Uitkomst = T1 - T2;
        SUitkomst = String.valueOf(Uitkomst);
        vak1.setText(SUitkomst);
        vak2.setText("");
        SUitkomst = String.valueOf(Uitkomst);
    }
}

class multiListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        T1 = Double.parseDouble(vak1.getText());
        T2 = Double.parseDouble(vak2.getText());
        Uitkomst = T1 * T2;
        SUitkomst = String.valueOf(Uitkomst);
        vak1.setText(SUitkomst);
        vak2.setText("");
        SUitkomst = String.valueOf(Uitkomst);
    }
}

class divListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        T1 = Double.parseDouble(vak1.getText());
        T2 = Double.parseDouble(vak2.getText());
        Uitkomst = T1 / T2;
        SUitkomst = String.valueOf(Uitkomst);
        vak1.setText(SUitkomst);
        vak2.setText("");
        SUitkomst = String.valueOf(Uitkomst);
    }
}

}
