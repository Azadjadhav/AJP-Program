package first_prg;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MultipleIPExample {
    public static void main(String[] args) {
        try {
            // Resolve the hostname into an array of InetAddress objects
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            
            // Print out each IP address
            System.out.println("IP addresses for www.google.com:");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.err.println("Hostname could not be resolved.");
            e.printStackTrace();
        }
    }
}

