package first_prg;
import java.awt.*;  
import java.awt.event.*;  
public class Mousemotion extends  MouseMotionAdapter{  
	Frame f;
	Mousemotion(){  
       f. addMouseMotionListener(this);  
          
       f. setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();  
    g.setColor(Color.RED);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}  
//public void mouseMoved(MouseEvent e) {}  
  
public static void main(String[] args) {  
    new Mousemotion();  
}  
}  