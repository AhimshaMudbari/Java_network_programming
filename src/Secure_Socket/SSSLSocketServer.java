package Secure_Socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ServerSocketFactory;

public class SSSLSocketServer {
	public static void main(String[] args) throws IOException {
		int port = 7000;
		if (args.length < 1) {
			System.out.println("Defaulting to port " + port + " since port is not specified");
		} else {
			port = new Integer(args[0]).intValue();
			System.out.println("Establishing server socket at port " + port);
			ServerSocketFactory factory = ServerSocketFactory.getDefault();
			ServerSocket serversocket = factory.createServerSocket(port);
			Socket s = serversocket.accept();
			BufferedInputStream is = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream os = new BufferedOutputStream(s.getOutputStream());
			byte buffer[] = new byte[4096];
			int bytesRead;
			while ((bytesRead = is.read(buffer)) > 0) {
				os.write(buffer, 0, bytesRead);
				os.flush();
			}
			s.close();
			serversocket.close();
		}
	}
}
