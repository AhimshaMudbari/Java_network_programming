package Multicasting;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
public class Sender {
	public static void main(String[] args) throws BindException {
		try {
			InetAddress group =InetAddress.getByName("225.168.1.102");
			MulticastSocket multicastSocket= new MulticastSocket();
			String msg="Ahim is multicasting messages";
			DatagramPacket packet= new DatagramPacket(msg.getBytes(), msg.length(),group,3456);
			multicastSocket.send(packet);
			multicastSocket.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
