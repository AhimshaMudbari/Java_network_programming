package NONBlockingIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFromChannel {
	public static void main(String[] args) {
		Path file = null;
		BufferedReader buffer = null;
		try {
			file = Paths
					.get("/home/ahimsha/eclipse-workspace/Netwokr programming/src/NONBlockingIO/readfromchannel.txt");
			InputStream is = Files.newInputStream(file);
			buffer = new BufferedReader(new InputStreamReader(is));
			System.out.println("Reading from readfromchannel.txt file: " + buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
	}
}
