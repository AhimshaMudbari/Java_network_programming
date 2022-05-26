package Multicasting;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
public class Receivers {
	public static void main(String[] args)throws BindException {
	try {
		InetAddress group = InetAddress.getByName("225.168.1.102");
		MulticastSocket multicastSocket= new MulticastSocket(3456);
		multicastSocket.joinGroup(group);
		byte[] buf= new byte[100];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		multicastSocket.receive(packet);
		System.out.println(new String(buf));
		multicastSocket.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


