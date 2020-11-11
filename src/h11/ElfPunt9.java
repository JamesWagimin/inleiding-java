package h11;

import java.applet.Applet;
import java.awt.*;

public class ElfPunt9 extends Applet {


    public void init() {
setSize(920,1080);

    }

    public void paint(Graphics g) {
        int bx=10, by=10, wx=10, wy=10;
        g.drawRect(59,9,401,401);

        while(bx < 400) {
            bx+= 100;
            g.fillRect(bx, by, 50, 50);
            g.fillRect(bx - 50, by + 50, 50, 50);
            g.fillRect(bx, by + 100, 50, 50);
            g.fillRect(bx - 50, by + 150, 50, 50);
            g.fillRect(bx, by + 200, 50, 50);
            g.fillRect(bx - 50, by + 250, 50, 50);
            g.fillRect(bx, by + 300, 50, 50);
            g.fillRect(bx - 50, by + 350, 50, 50);

        }
    }

}
