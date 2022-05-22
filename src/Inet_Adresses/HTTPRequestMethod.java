package Inet_Adresses;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPRequestMethod {
	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		var client = HttpClient.newBuilder().build();
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("Status code: " + response.statusCode());
		System.out.print(response.body().toString());
	}
}
