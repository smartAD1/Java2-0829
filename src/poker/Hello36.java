package poker;

import java.io.File;
import java.io.FileReader;

import com.sun.javafx.fxml.expression.Expression;

public class Hello36 {

	public static void main(String[] args) {
		File f1 = new File("dir1/tet.txt");
		try{
			FileReader reader = new FileReader(f1);
			int c;
			while ((c = reader.read()) != -1){
				System.out.print((char)c);
			}
			reader.close();
		}catch (Exception e){
			System.out.println(e.toString());
		}
		}

}
