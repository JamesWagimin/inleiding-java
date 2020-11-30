package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TwaalfPunt3 extends Applet {

    TextField input[] = new TextField[5];
    Button submit;

    int cijfers[] = new int[5];

    public void init() {
        for(int i=0; i!=5; i++){
            input[i] = new TextField("",10);
            add(input[i]);
        }
        submit = new Button("Submit");
        submit.addActionListener(new calc());
        add(submit);


    }

    public void paint(Graphics g) {


    }

    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e){
            for(int i=0; i!=5; i++){
                cijfers[i] = Integer.parseInt(input[i].getText());
            }
            Arrays.sort(cijfers);
            for(int i=0; i!=5; i++){
                input[i].setText(String.valueOf(cijfers[i]));
            }
        }
    }
}
