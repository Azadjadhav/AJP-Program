package first_prg;
import javax.swing.*;
public class Jtable {

	
	JFrame f;
	public Jtable()
	{    
	    f=new JFrame();    
	    String data[][]={{"my data 1","my data 2","my data 3"},{"my data 4","my data 5","my data 6"},{"my data 7","my data 8","my data 9"},{"my data 10","my data 11","my data 12"}};   
	    String column[]={"Column 1","Column 2","Column 3"};         
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.add(sp);          
	    f.setSize(300,400);    
	    f.setVisible(true);    
	}
	
	
	public static void main(String[] args)
	{
		new Jtable();
	}

}