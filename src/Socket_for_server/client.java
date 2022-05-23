package Socket_for_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.BindException;
import java.net.Socket;

public class client {
	public static void main(String[] args) throws BindException {
		try {
			Socket s = new Socket("127.0.0.1", 7000);
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg = in.readLine();
			System.out.println("Server" + msg);

		} catch (Exception e) {
			System.err.print(e);
		}
	}
}
