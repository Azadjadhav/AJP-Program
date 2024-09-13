package first_prg;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet_method {
    public static void main(String[] args) {
        try {
            // 1. Get an InetAddress object for a hostname
            InetAddress address1 = InetAddress.getByName("www.google.com");
            System.out.println("Address for : " + address1.getHostAddress());

            // 2. Get all InetAddress objects for a hostname
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            System.out.println("All addresses for www.example.com:");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }

            // 3. Get the local host InetAddress object
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local host address: " + localAddress.getHostAddress());

            // 4. Create InetAddress from raw IP address
            byte[] addressBytes = { (byte) 192, (byte) 168, 1, 1 };
            InetAddress address4 = InetAddress.getByAddress(addressBytes);
            System.out.println("Address from byte array: " + address4.getHostAddress());

            // 5. Create InetAddress with a hostname and IP address
            InetAddress address5 = InetAddress.getByAddress("zeal", addressBytes);
            System.out.println("Address with custom hostname: " + address5.getHostName() + " -> " + address5.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
