package first_prg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class prc11 extends JFrame implements MouseListener {
    private JButton button;
    private JTextField textField;

    public prc11() {
        
        setTitle("Mouse Event Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        

        textField = new JTextField();
        textField.setBounds(50, 30, 200, 30);
        textField.addMouseListener(this);

        
       
        add(textField);

     
        getContentPane().setBackground(Color.cyan);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        getContentPane().setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        getContentPane().setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        getContentPane().setBackground(Color.pink);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        getContentPane().setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        getContentPane().setBackground(Color.black);
    }

    public static void main(String[] args) {
        // Create and show the frame
       // SwingUtilities.invokeLater(() -> {
           prc11 frame = new prc11();
            frame.setVisible(true);
      
    }
}
