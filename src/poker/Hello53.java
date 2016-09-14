package poker;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.BufferUnderflowException;

public class Hello53 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.iii.org.tw");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line ;
			while ( (line =reader.readLine()) !=null){
				System.out.println(line);
			}
			reader.close();
			
			
		} catch (Exception e) {


		}
	}

}
