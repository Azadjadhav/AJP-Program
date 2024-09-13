package first_prg;


import java.awt.*;
import java.util.*;
 
public class demo 
{
    public static void main( String args[] )
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setTitle("demo");
        f.setSize(400,400); 
        f.setLayout(new FlowLayout());
   
       Label l1 = new Label("Select Subjects:");
        
        Checkbox cb1 = new Checkbox("English");
        Checkbox cb2 = new Checkbox("Sanskrit");
        Checkbox cb3 = new Checkbox("Hindi");
        Checkbox cb4 = new Checkbox("Marathi");
         
        Label l2 = new Label("Select Gender:");
       CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male",cg,true);        
        Checkbox c2 = new Checkbox("Female",cg,true);        
         
        f.add(l1);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(l2); 
        f.add(c1); 
        f.add(c2);
    }
 
}
