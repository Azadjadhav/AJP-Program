package first_prg;

import java.awt.*;
import java.awt.event.*;

public class textlistener implements TextListener {
   Frame frame;
   TextField textField;
    public textlistener() {
        frame = new Frame("TextListener Example");
        textField = new TextField(20);
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        textField.addTextListener(this);
        frame.setSize(250, 100);
        frame.setVisible(true);
        
    }

    @Override
    public void textValueChanged(TextEvent e) {
    
        System.out.println("Text changed: " + textField.getText());
    }

    public static void main(String[] args) {

        new textlistener();
    }
}
