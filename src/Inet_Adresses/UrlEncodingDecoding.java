package Inet_Adresses;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlEncodingDecoding {
	public static void main(String[] args) throws Exception {
		String url = "https://www.google.com";
		String url2 = "https%3A%2F%2Fwww.google.com";
		System.out.println("Encoded Url: " + URLEncoder.encode(url, StandardCharsets.UTF_8.name()));
		System.out.println("Decoded Url: " + URLDecoder.decode(url2, StandardCharsets.UTF_8.name()));
	}
}
