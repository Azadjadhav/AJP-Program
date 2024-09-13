package first_prg;

import javax.swing.*;  
public class jsliderr extends JFrame{  
public jsliderr() {  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
  
public static void main(String s[]) {  
	jsliderr frame=new jsliderr ();  
frame.pack();  
frame.setVisible(true);  
}  
}  