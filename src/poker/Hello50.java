package poker;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Hello50 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		while(true){
		try {
			DatagramSocket socket = 
				new DatagramSocket(8888);
			DatagramPacket packet = 
				new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			
			InetAddress urip = packet.getAddress();
			byte [] data = packet.getData();
			int len = packet.getLength();
			
			System.out.println(urip.getHostAddress()+":" +
			new String(data,0,len));
	}catch (IOException e) {
		System.out.println(e.toString());
	}

}
}
}