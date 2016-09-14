package poker;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Hello54 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com/?url=https://www.gamer.com.tw");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
		InputStream in = conn.getInputStream();
		FileOutputStream fout = 
				new FileOutputStream("dir1/gamer.pdf");
		byte[] buf = new byte[4096]; int lan;
		while( (lan= in.read(buf)) !=-1){
			fout.write(buf,0,lan);
			
		}
			
			fout.flush();
			fout.close();
			in.close();
			System.out.println("OK");
		} catch (Exception e) {
				System.out.println(e.toString());

		}
	}

}
