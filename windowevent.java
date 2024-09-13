package first_prg;

import java.awt.*;
import java.awt.event.*;

public class windowevent extends  WindowAdapter {

     Frame frame;

    public windowevent() {
 
        frame = new Frame("WindowEvent Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.addWindowListener(this);
    }

   @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
     
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        // Exit the application when the window is closing
    	System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
   // public void windowIconified(WindowEvent e) {
    //    System.out.println("Window Iconified");
    //}

    //@Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public static void main(String[] args) {
        new windowevent();
    }
}
