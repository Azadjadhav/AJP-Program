package first_prg;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class jcombobox {

	public static void main(String[] args)
	{
		
//		1. Write a program to develop a frame to select the different states of India using
//		JComboBox
	
		JFrame f1= new JFrame("My ComboBox Expl");
		f1.setVisible(true);
		f1.setBounds(100, 100, 700, 800);
		f1.setLayout(null);
		
		
		String country[]={"Maharshtra","Karnataka","Assam","Kerala","Rajsthan","Panjab","Delhi","UP","Bihar"};        
		JComboBox cb=new JComboBox(country);    
		cb.setBounds(150, 150,90,20);    
		f1.add(cb);        
		
		

	}

}