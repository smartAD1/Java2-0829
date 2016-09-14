package poker;


import java.net.InetAddress;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.UnknownException;

public class Hello48 {

	public static void main(String[] args) {

			try {InetAddress ip = 
				 InetAddress.getByName("localHost");
			System.out.println(ip.getHostAddress());
			} catch (UnknownHostException e) {
				System.out.println("UnknownHost");
			
			}
		}					
	}


	

