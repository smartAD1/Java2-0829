package poker;

import java.io.File;
import java.io.IOException;

public class Hello34 {

	public static void main(String[] args) {
		File file1 = new File("c:/king");
		if (file1.isFile()) {
			System.out.println("OK");
		} else {
			try {
				if (file1.createNewFile()) {
					System.out.println("createOK");
				}
			} catch (IOException ie) {
				System.out.println();
			}
		}
		File file2 = new File("c:/test/dir1/dir2/dir3");
						file2.mkdirs();

	}
}
