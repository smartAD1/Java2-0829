package poker;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Hello49 {

	public static void main(String[] args) {
		String data = "Hello";
		byte[] buf = data.getBytes();
		try {
			DatagramSocket socket = 
				new DatagramSocket();
			DatagramPacket packet =
				new DatagramPacket(buf, buf.length,
					InetAddress.getByName("10.1.6.53"),8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}		