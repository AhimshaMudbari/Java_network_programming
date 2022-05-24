package Socket_for_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientForMultiThread {
	public static void main(String[] args) {
		String host = "127.0.0.1";
		int port = 7777;
		try (Socket socket = new Socket(host, port)) {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
			System.out.println("Enter message");
			Scanner sc = new Scanner(System.in);
			String line = null;
			while (!"exit".equalsIgnoreCase(line)) {
				line = sc.nextLine();
				out.println(line);
				out.flush();
				System.out.println("server replied: " + in.readLine());
			}
			sc.close();
		} catch (IOException e) {
		}
	}
}
