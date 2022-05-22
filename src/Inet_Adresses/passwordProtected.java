package Inet_Adresses;

import java.io.InputStream;
import java.io.Reader;
import java.net.Authenticator;
import java.net.URL;

import com.macfaq.net.DialogAuthenticator;

public class passwordProtected {

	public static void main(String[] args) throws Exception {
		Authenticator.setDefault(new DialogAuthenticator());
		for (int i = 0; i < args.length; i++) {
			URL url = new URL(args[i]);
			InputStream input = url.openStream();
			Reader reader = new java.io.InputStreamReader(input);
			int c;
			while ((c = reader.read()) != -1) {
				System.out.println((char) c);
			}
			System.out.println();
			System.exit(0);
		}
	}

}
