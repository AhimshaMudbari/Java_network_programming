package Inet_Adresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipv4orIPv6 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress iadd = InetAddress.getLocalHost();
		byte[] add = iadd.getAddress();
		if (add.length == 4) {
			System.out.println("IPv4: " + iadd.toString().replace("ahimsha-HP-EliteBook-830-G5/", ""));
		}
		if (add.length > 4) {
			System.out.println("IPv6: " + iadd.toString().replace("ahimsha-HP-EliteBook-830-G5/", ""));
		}
	}
}
