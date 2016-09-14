package poker;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Hello55 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.1.6.65/addData.php?cname=ericV1&tel=1234&birthday=1991-01-01");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			conn.getInputStream();
		
	
			System.out.println("OK");
		} catch (Exception e) {
				System.out.println(e.toString());

		}
	}

}
