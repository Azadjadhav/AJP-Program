package first_prg;


import java.awt.*;
import java.awt.event.*;

public class Prc_3 {

	public static void main(String ar[])
	{
		
		Frame f1=new Frame("GridBagLayout_Using_Constraints");
		f1.setVisible(true);
		f1.setSize(500, 600);
		
		Panel p1=new Panel();
		f1.add(p1);
		
		GridBagLayout grid=new GridBagLayout();
		
		GridBagConstraints c1=new GridBagConstraints();
		 
		c1.insets=new Insets(10,100,0,0);
		
		c1.gridx=1;
		c1.gridy=0;
		
		c1.ipadx=50;
		c1.ipady=30;
		
		
		Button b5;
		Label b1,b3;
		TextField b2;
		TextArea b4;
		
		b1=new Label("Name");
		
		grid.setConstraints(b1, c1);
		p1.add(b1);
		
		b3=new Label("Comments :");
		c1.gridx=1;
		c1.gridy=1;
		grid.setConstraints(b3, c1);
		p1.add(b3);
		
		
		b2=new TextField();
		c1.gridx=2;
		c1.gridy=0;
		grid.setConstraints(b2, c1);
		p1.add(b2);
		
		b4=new TextArea(10,20);
		c1.gridx=2;
		c1.gridy=1;
		grid.setConstraints(b4, c1);
		p1.add(b4);
		
		b5=new Button("Submit");
		c1.gridx=2;
		c1.gridy=3;
		c1.ipadx=100;
		c1.ipady=60;
		
		grid.setConstraints(b5, c1);
		p1.add(b5);		
		
		
		p1.setLayout(grid);
		
	}
}
