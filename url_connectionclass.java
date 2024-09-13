package first_prg;

import java.io.*;    
import java.net.*;
import java.util.Date;    
public class url_connectionclass {    
public static void main(String[] args){    
try{    
URL url=new URL("https://www.google.com");    
URLConnection urlcon=url.openConnection();    
System.out.println(new Date(urlcon.getLastModified()));
  System.out.println(urlcon.getContentType());
  System.out.println(urlcon.getURL());
  System.out.println(urlcon.getContentLength());
}catch(Exception e){System.out.println(e);}    
}    
}    