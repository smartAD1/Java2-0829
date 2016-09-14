package poker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

import com.sun.prism.impl.shape.OpenPiscesPrismUtils;

public class Hello51 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File sendFile = new File("dir1/1.jpg");
			byte[] buf = new byte[(int) sendFile.length()];
			FileInputStream fin = new FileInputStream(sendFile);
			fin.read(buf);
			fin.close();

			Socket socket = new Socket(InetAddress.getByName("10.1.6.53"), 9998);

			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();

			socket.close();
			System.out.println(System.currentTimeMillis() - start);
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
