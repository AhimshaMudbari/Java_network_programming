package Inet_Adresses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Rechability_testing {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host1 = "192.168.1.102";
		String host2 = "216.58.196.174";
		InetAddress iaddr = InetAddress.getByName(host1);
		InetAddress iaddr2 = InetAddress.getByName(host2);
		boolean initialstate1 = iaddr.isReachable(1000);
		if (initialstate1) {
			System.out.println("The local host is rechable and state: " + initialstate1);
		} else {
			System.out.println("The local host is unrechable and state: " + initialstate1);
		}
		boolean initialstate2 = iaddr2.isReachable(1000);
		if (initialstate2) {
			System.out.println("The host google.com is rechable and state: " + initialstate2);
		} else {
			System.out.println("The host google.com is unrechable and state: " + initialstate2);
		}
	}
}
