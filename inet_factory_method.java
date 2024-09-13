package first_prg;
import java.net.*;
public class inet_factory_method {
public static void main(String ar[])throws UnknownHostException {
	InetAddress add1= InetAddress.getLocalHost();
	System.out.println(add1);
	InetAddress add2= InetAddress.getByName("www.google.com");
	System.out.println(add2);
	InetAddress [] add3= InetAddress.getAllByName("www.google.com");
	for(int i=0;i<add3.length;i++) {
	System.out.println(add3[i]);}
	
}


}
