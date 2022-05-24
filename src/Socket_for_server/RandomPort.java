package Socket_for_server;

import java.net.ServerSocket;

public class RandomPort {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(0);
		System.out.println("Server running in port: " + ss.getLocalPort());
	}
}
