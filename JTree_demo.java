package first_prg;
import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class JTree_demo {  
JFrame f;  
JTree_demo()
{  
    f=new JFrame();   
    
    DefaultMutableTreeNode India=new DefaultMutableTreeNode("India");  
    DefaultMutableTreeNode Maharashtra=new DefaultMutableTreeNode("Maharashtra");  
    DefaultMutableTreeNode Gujrat=new DefaultMutableTreeNode("Gujrat");  
    India.add(Maharashtra);  
    India.add(Gujrat);  
    
    DefaultMutableTreeNode Mumbai=new DefaultMutableTreeNode("Mumbai");  
    DefaultMutableTreeNode Pune=new DefaultMutableTreeNode("Pune");  
    DefaultMutableTreeNode Nashik=new DefaultMutableTreeNode("Nashik");  
    DefaultMutableTreeNode Nagpur=new DefaultMutableTreeNode("Nagpur");  
    Maharashtra.add(Mumbai); Maharashtra.add(Pune); Maharashtra.add(Nashik); Maharashtra.add(Nagpur);   
    
    JTree jt=new JTree(India);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new  JTree_demo();  
}}  