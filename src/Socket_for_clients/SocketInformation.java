package Socket_for_clients;

import java.net.Socket;

public class SocketInformation {

	public static void main(String[] args) throws Exception {
		for (String localhost : args) {
			Socket theSocket = new Socket(localhost, 80);
			System.out.println("Connected to " + theSocket.getInetAddress());
			System.out.println(" on port " + theSocket.getPort() + " from port " + theSocket.getLocalPort() + " of "
					+ theSocket.getLocalAddress());
			System.out.println("hello");
		}
	}

}
