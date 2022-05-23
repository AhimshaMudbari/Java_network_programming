package Socket_for_clients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.Socket;

public class client {
	public static void main(String[] args) throws Exception, BindException {
		Socket s = new Socket("localhost", 7777);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("are you listening?");
		pr.flush();
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Server said: " + str);
	}
}
