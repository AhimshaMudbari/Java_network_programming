package Inet_Adresses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class NetworkInterfaceclass {
	public static void main(String[] args) throws IOException, UnknownHostException {
		ArrayList<NetworkInterface> ni = Collections.list(NetworkInterface.getNetworkInterfaces());
		for (NetworkInterface i : ni) {
			System.out.println();
			System.out.println("interface name: " + i.getDisplayName());
			System.out.println();
			Enumeration<InetAddress> addr = i.getInetAddresses();
			System.out.println("interfaces addresses: ");
			while (addr.hasMoreElements()) {
				InetAddress add = addr.nextElement();
				System.out.println(add);
			}
		}
	}
}
