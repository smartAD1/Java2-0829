package poker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Hello39 {

	public static void main(String[] args) {
		Student s1 = new Student(76, 54, 43);
		System.out.println(s1.getScore());
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream otu = 
					new ObjectOutputStream(
							new FileOutputStream("dir1/t.dat"));
			otu.flush();
			otu.close();
		} catch (IOException e) {
			System.out.println("Expectoin:" + e.toString());
		}

	}

}

class Student implements Serializable {
	int ch, eng, math;

	Student(int ch, int eng, int math) {
		this.ch = ch;
		this.eng = eng;
		this.math = math;
	}

	int getScore() {
		return ch + eng + math;
	}

	double getAvg() {
		return getScore() / 3.0;
	}
}