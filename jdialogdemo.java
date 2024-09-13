package first_prg;

//java Program to create a simple JDialog
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class jdialogdemo extends JFrame implements ActionListener {
	static JFrame f;
	public static void main(String[] args)
	{
		f = new JFrame("frame");

		jdialogdemo s = new jdialogdemo();
		JPanel p = new JPanel();
		JButton b = new JButton("click");
		b.addActionListener(s);
		p.add(b);
		f.add(p);
		f.setSize(400, 400);
		f.setVisible(true);  
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if (s.equals("click")) {
			JDialog d = new JDialog(f, "dialog Box");
			JLabel l = new JLabel("this is a dialog box");
			d.add(l);
			d.setSize(100, 100);
			d.setVisible(true);
		}
	}
}
