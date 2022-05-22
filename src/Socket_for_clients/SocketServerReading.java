package Socket_for_clients;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketServerReading {

	public static void main(String[] args) throws Exception {
		Socket soc = new Socket("www.google.com", 4040);
		InputStream is = soc.getInputStream();
		PrintWriter pw = new PrintWriter(soc.getOutputStream());
		pw.println("GET / HTTP/ 1.0");
		pw.println();
		pw.flush();
		byte[] buffer = new byte[1024];
		int read;
		while ((read = is.read()) != -1) {
			String output = new String(buffer, 0, read);
			System.out.println(output);
			System.out.flush();
		}
		soc.close();
	}

}
