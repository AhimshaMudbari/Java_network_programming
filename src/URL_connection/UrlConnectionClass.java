package URL_connection;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionClass {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://jsonplaceholder.typicode.com/users/1");
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		int i;
		while ((i = is.read()) != -1)
			System.out.print((char) i);
	}
}
