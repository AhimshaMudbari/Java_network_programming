package Inet_Adresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet_ipaddr {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress lh = InetAddress.getLocalHost();
		System.out.println("localhost: " + lh);
		String host = "facebook.com";
		System.out.println();
		InetAddress[] i = InetAddress.getAllByName(host);
		for (InetAddress a : i) {
			System.out.println("ip addresses of host: " + a.toString());
		}
	}

}
