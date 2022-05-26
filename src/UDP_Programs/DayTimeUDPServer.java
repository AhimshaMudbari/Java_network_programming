package UDP_Programs;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class DayTimeUDPServer {
	public static void main(String[] args)throws Exception {
	DatagramSocket ds = new DatagramSocket(5555);
	byte[] b1= new byte[1024];
	DatagramPacket dp = new DatagramPacket(b1, b1.length);
	ds.receive(dp);
	String str = new String(dp.getData());
	System.out.println("Server is sending "+str+" for multiplication");
	int num = Integer.parseInt(str.trim());
	int result= num*num;
	byte[] b2= String.valueOf(result).getBytes();
	InetAddress ia= InetAddress.getLocalHost();
	DatagramPacket dp1=new DatagramPacket(b2, b2.length,ia,dp.getPort());
	ds.send(dp1);
	}
}
