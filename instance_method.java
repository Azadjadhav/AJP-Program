package first_prg;
import java.net.*;
public class instance_method {
public static void main(String ar[])throws Exception{
	InetAddress add1 = InetAddress.getByName("www.youtube.com");
	InetAddress add2 = InetAddress.getByName("ptu.ac.in");
	System.out.println(add1.equals(add2));
	System.out.println(add1.getHostAddress());
	System.out.println(add1.getHostName());
	System.out.println(add1.isMulticastAddress());
	System.out.println(add1.toString());

	
}
}
