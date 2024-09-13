package first_prg;


import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends WindowAdapter {
    Frame f;

    AdapterExample() {
        f = new Frame("Window Adapter");
        f.addWindowListener(this);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        System.exit(0);  // Exit the application when the window is closing
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}
