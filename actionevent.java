package first_prg;
import java.awt.*;
import java.awt.event.*;

public class actionevent implements ActionListener {//1st step

    Button button;
    TextField tx;

    public actionevent() {
        Frame frame = new Frame("Button Example");
        
        tx = new TextField();
        tx.setBounds(50, 50, 150, 20);
        
        button = new Button("Click Here");
        button.setBounds(50, 100, 100, 30);
        button.addActionListener(this); ///2nd step

        frame.add(tx); 
        frame.add(button);
        
        frame.setSize(250, 200);
        frame.setLayout(null);
        frame.setVisible(true);
      
    }

    public void actionPerformed(ActionEvent e) { ///third step
        tx.setText("Zeal poly");
    }

    public static void main(String[] args) {
        new actionevent();
    }
}
