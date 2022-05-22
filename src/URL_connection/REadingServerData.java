package URL_connection;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class REadingServerData {
	public static void main(String[] args) throws Exception, IndexOutOfBoundsException {
		if (args.length > 0) {
			URL url = new URL(args[0]);
			URLConnection uc = url.openConnection();
			InputStream ic = uc.getInputStream();
			InputStream buffer = new BufferedInputStream(ic);
			Reader read = new InputStreamReader(buffer);
			int c;
			while ((c = read.read()) != -1) {
				System.out.println((char) c);
			}
		} else {
			System.out.println("null");
		}
	}
}
