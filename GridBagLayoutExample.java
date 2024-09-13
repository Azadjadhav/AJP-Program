package first_prg;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import java.awt.Frame.*;  
public class GridBagLayoutExample extends Frame{  
    public static void main(String[] args) {  
            GridBagLayoutExample a = new GridBagLayoutExample();  
            
           a. setSize(300, 300);  
           a. setVisible(true);  
           a. setTitle("GridBag Layout Example");
        }  
        public GridBagLayoutExample() {  
    GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gbc = new GridBagConstraints();  
            setLayout(grid);  
        
            GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);  
    
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new Button("Button two"), gbc);  
    
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Button("Button Three"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new Button("Button Four"), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 2;  
    this.add(new Button("Button Five"), gbc);  
           
        }
}  