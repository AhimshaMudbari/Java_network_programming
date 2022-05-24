package Secure_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SSLSocketClient {
	public static void main(String[] args) throws Exception, SSLHandshakeException {
		try {
			SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			SSLSocket socket = (SSLSocket) factory.createSocket("www.npm.com", 443);
			socket.startHandshake();
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			out.println("GET/ HTTP/1.0");
			out.println();
			out.flush();
			if (out.checkError())
				System.out.println("SSLSocket client: java.io.printWriter error");
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String input;
			while ((input = in.readLine()) != null)
				System.out.println(input);
			in.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
