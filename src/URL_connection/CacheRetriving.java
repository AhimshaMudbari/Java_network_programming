package URL_connection;

import java.io.IOException;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.ResponseCache;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class CacheRetriving {
	public static void main(String[] args) throws Exception {
		String u = "https://www.instagram.com";
		URI uri = new URI(u);
		URL url = new URL("http://www.reddit.com");
		URLConnection uc = url.openConnection();
		ResponseCache rc = new ResponseCache() {
			@Override
			public CacheRequest put(URI u, URLConnection con) throws IOException {
				return null;
			}

			@Override
			public CacheResponse get(URI u, String reqMethod, Map<String, List<String>> rqstHeaders)
					throws IOException {
				return null;
			}
		};
		System.out.println(rc.put(uri, uc));
	}
}
