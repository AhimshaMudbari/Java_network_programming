package Socket_for_clients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) throws Exception, BindException {
		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();
		System.out.println("Client connected");
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("client said: " + str);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("I am listening");
		pr.flush();
	}
}
