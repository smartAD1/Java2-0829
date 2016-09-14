package poker;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.BufferUnderflowException;

public class Hello56 {


	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.1.6.53/query.php");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedReader reader = 
				new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line;
			while ( (line = reader.readLine()) != null){
				String[] data = line.split(":");
				System.out.println(data[0] + "-" + 
						data[1]);
				
			}
			
			reader.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}