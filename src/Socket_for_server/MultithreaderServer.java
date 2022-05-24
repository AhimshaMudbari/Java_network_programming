package Socket_for_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreaderServer {
	public static void main(String[] args) throws Exception, BindException {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			server.setReuseAddress(true);
			while (true) {
				Socket client = server.accept();
				System.out.println("New client connected" + client.getInetAddress().getHostAddress());
				ClientHandler clientsock = new ClientHandler(client);
				new Thread(clientsock).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class ClientHandler implements Runnable {
	public final Socket clientsocket;

	public ClientHandler(Socket socket) {
		this.clientsocket = socket;
	}

	@Override
	public void run() {
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			out = new PrintWriter(clientsocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.printf("sent from client %s\n", line);
				out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
					clientsocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
