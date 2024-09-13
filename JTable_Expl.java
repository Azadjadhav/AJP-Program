package first_prg;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTable_Expl {

	public static void main(String[] args)
	{
		
		JFrame f1=new JFrame();
		f1.setVisible(true);
		f1.setBounds(100,100,500,600);
	

		String title[]= {"ID","NAME","SALARY"};
		
		String data[][]= {{"101","Amit","670000"},{"102","Jai","780000"},{"103","Sachin","700000"}};
		
		JTable t1=new JTable(data,title);
		t1.setBounds(100,200,500,400);
		
		JScrollPane sp = new JScrollPane(t1);
		f1.add(t1);

		
	}

}
