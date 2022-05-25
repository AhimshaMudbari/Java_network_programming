package NONBlockingIO;

import java.io.IOException;
import java.net.SocketOption;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ListingSupportedChannel {
	public static void main(String[] args) throws IOException, AssertionError {
		printOptions(SocketChannel.open());
		printOptions(ServerSocketChannel.open());
		printOptions(AsynchronousSocketChannel.open());
		printOptions(AsynchronousServerSocketChannel.open());
		printOptions(DatagramChannel.open());
	}

	private static void printOptions(NetworkChannel channel) throws IOException {
		System.out.println(channel.getClass().getSimpleName() + " supports:");
		for (SocketOption<?> option : channel.supportedOptions()) {
			System.out.println(option.name() + ": " + channel.getOption(option));
		}
		System.out.println();
		channel.close();
	}
}
