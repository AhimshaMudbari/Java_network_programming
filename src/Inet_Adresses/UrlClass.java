package Inet_Adresses;

import java.net.URI;

public class UrlClass {
	public static void main(String[] args) throws Exception {
		String host = "https://www.fb.com/home";
		URI uri = new URI(host);
		System.out.println("Base uri: " + uri.toString());
		System.out.println("Protocol: " + uri.getScheme());
		System.out.println("User Info: " + uri.getUserInfo());
		System.out.println("Authority: " + uri.getAuthority());
	}
}
