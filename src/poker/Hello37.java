package poker;

import java.io.FileOutputStream;

public class Hello37 {

	public static void main(String[] args) {
		try{
			FileOutputStream fout = 
					new FileOutputStream("dir1/tet2.txt",true);
			fout.write("13456789\n987654321\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("write ok");
		}catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
