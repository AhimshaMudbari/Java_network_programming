package Inet_Adresses;

import java.net.URL;

public class UriClass {
	public static void main(String[] args) throws Exception {
		String host = "http://www.fb.com/home";
		URL url = new URL(host);
		System.out.println("Protocol: " + url.getProtocol());
		System.out.println("Host Name: " + url.getHost());
		System.out.println("Port Number: " + url.getPort());
		System.out.println("File Name: " + url.getFile());
		System.out.println("Path: " + url.getPath());
		System.out.println("Default Port: " + url.getDefaultPort());
	}
}
