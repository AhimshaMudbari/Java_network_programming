package Socket_for_server;

import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DaytimeServer {
	public static void main(String[] args) throws Exception, BindException {
		ServerSocket server = new ServerSocket(7000);
		while (true) {
			System.out.println("Waiting for client connection");
			Socket soc = server.accept();
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println("Time and date is: " + new Date());
		}
	}
}
