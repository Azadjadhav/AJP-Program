package first_prg;

import java.awt.*;
import java.applet.*;
/*<applet code="First.class" width="300" height="300">  </applet>*/
public class prc_2 extends Applet {


	public  void init() 
	{

		List l1 = new List();
		l1.add("Pune");
		l1.add("Thane");
		l1.add("Mumbai");
		l1.add("Kalyan");
		l1.add("Solapur");
		l1.add("Kolhapur");
		l1.add("Osmanabad");
		l1.add("Latur");
		l1.add("SambhajiNagar");
		l1.add("Parbhani");
		
		add(l1);

	}

}

