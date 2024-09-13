package first_prg;

import java.awt.*;
public class prc_2_1 {
	
	prc_2_1()
	{
		Frame f1=new Frame("Paper Names");
		f1.setVisible(true);
		f1.setBounds(100,100,800,600);
		f1.setLayout(new FlowLayout(FlowLayout.CENTER,20,100));
		
		f1.add(new Label("Select Papers:"));
		
		f1.add(new Checkbox("Lokmat"));
		f1.add(new Checkbox("Pudhari"));
		f1.add(new Checkbox("Sakal"));
		f1.add(new Checkbox("Times of India"));
		f1.add(new Checkbox("Sandhyakal"));
		f1.add(new Checkbox("Maharshtra Times"));
		
	}
	
	public static void main(String ar[])
	{
		prc_2_1 s1=new prc_2_1();
		
		
	}

}