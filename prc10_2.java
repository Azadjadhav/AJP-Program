package first_prg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class prc10_2 implements KeyListener
{
	Frame f1;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	public static void main(String args[])
	{
		prc10_2 d1=new prc10_2();
		
		d1.MyFrame();
	}
	
	void MyFrame()
	{
		f1=new Frame();
		f1.setSize(500,500);
		f1.setVisible(true);
	
		
		f1.setTitle("KeyEvent Demo");
		f1.setLayout(null);
		
		l1=new Label("Enter First Number: ");
		l1.setBounds(100,100,150,30);
		
		t1=new TextField();
		t1.setBounds(260,100,60,30);
		
		l2=new Label("Enter Second Number: ");
		l2.setBounds(100,150,150,30);
		
		t2=new TextField();
		t2.setBounds(260,150,60,30);
		
		l3=new Label("Which Operation: ");
		l3.setBounds(100,200,150,30);
		
		t3=new TextField();
		t3.setBounds(250,200,100,30);
		
		t3.addKeyListener(this);

		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(l3);
		f1.add(t3);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource()==t1)
		{
//			l1.setText("key typed");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		Integer c = a*b;
		
		t3.setText(" = "+Integer.toString(c));
		System.out.println(Integer.toString(c));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		l1.setText("key Released");
		
	}
	
}