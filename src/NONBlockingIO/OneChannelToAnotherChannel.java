package NONBlockingIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class OneChannelToAnotherChannel {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream(
				"/home/ahimsha/eclipse-workspace/Netwokr programming/src/NONBlockingIO/input.txt");
		ReadableByteChannel source = input.getChannel();
		FileOutputStream output = new FileOutputStream(
				"/home/ahimsha/eclipse-workspace/Netwokr programming/src/NONBlockingIO/output.txt");
		WritableByteChannel destination = output.getChannel();
		copyData(source, destination);
		source.close();
		destination.close();
	}

	public static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = java.nio.ByteBuffer.allocateDirect(20 * 1024);
		while (src.read(buffer) != -1) {
			buffer.flip();
			while (buffer.hasRemaining()) {
				dest.write(buffer);
			}
			buffer.clear();
		}
	}
}
