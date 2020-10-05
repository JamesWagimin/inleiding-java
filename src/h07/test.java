package h07;

import java.applet.Applet;


import java.awt.*;

public class test extends Applet {

    TextField textTest;
Label textlabel;
String s;

    @Override
    public void init() {
        textTest = new TextField("Klik hier",20);
        textlabel = new Label("Type iets in het textvak en druk enter");
        add(textlabel);
        add(textTest);
        s="";

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
