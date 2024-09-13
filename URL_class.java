package first_prg;

import java.net.*;  
public class URL_class {  
public static void main(String[] args)throws UnknownHostException, MalformedURLException{  

URL url=new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");  
  
System.out.println("Protocol: "+url.getProtocol());  
System.out.println("Host Name: "+url.getHost());  
System.out.println("Port Number: "+url.getPort());  
System.out.println("File Name: "+url.getFile());  
System.out.println("user: "+url.getUserInfo());  
System.out.println("Default Port Number: "+url.getDefaultPort());    
System.out.println("Query String: "+url.getQuery());    
System.out.println("Path: "+url.getPath());   

}  
}  