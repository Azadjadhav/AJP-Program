package first_prg;
import java.awt.*;
import java.awt.event.*;

public class inner_Clss extends Frame {
private Button button;

public inner_Clss() {
button = new Button("Click Me");
button.setBounds(100, 100, 80, 30);
add(button);
// Attach an ActionListener using an inner class
button.addActionListener(new ButtonClickListener());
setSize(300, 200);
setLayout(null);
setVisible(true);
}
// Inner class for handling button click events
private class ButtonClickListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
if (e.getSource() == button) {
System.out.println("Button Clicked!");
}
}
}
public static void main(String[] args) {
new inner_Clss();
}
}

