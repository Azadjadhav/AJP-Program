package first_prg;

import java.awt.*;

import java.awt.event.*;

public class itemevent implements ItemListener

{

Frame Frame;

List l1;

Label label;
itemevent()

{

Frame= new Frame("Java Item Listener");

l1= new List();
l1.add("cs");
l1.add("it");
l1.add("mech");
label = new Label();
Frame.add(l1);
Frame.add(label);
l1.addItemListener(this);

Frame.setLayout(new FlowLayout());

Frame.setSize(220,150);

Frame.setVisible(true);

}

public void itemStateChanged(ItemEvent ie)

{

label.setText(l1.getSelectedItem());
}

public static void main(String... ar)

{

new itemevent();

}

}