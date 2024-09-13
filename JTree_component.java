package first_prg;

import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class JTree_component {  
JFrame f;  
JTree_component(){  
    f=new JFrame();   
    DefaultMutableTreeNode folder=new DefaultMutableTreeNode("folder");  
    DefaultMutableTreeNode sub_folder=new DefaultMutableTreeNode("sub-folder");  
    DefaultMutableTreeNode sub_file=new DefaultMutableTreeNode("sub-file");  
    folder.add(sub_folder);  
    folder.add(sub_file);  
    DefaultMutableTreeNode file1=new DefaultMutableTreeNode("file1");  
    DefaultMutableTreeNode file2=new DefaultMutableTreeNode("file2");  
    DefaultMutableTreeNode file3=new DefaultMutableTreeNode("file3");  
    DefaultMutableTreeNode file4=new DefaultMutableTreeNode("file4");  
    sub_folder.add(file1); sub_folder.add(file2); sub_folder.add(file3); sub_folder.add(file4);      
    JTree jt=new JTree(folder);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new JTree_component();  
}}  