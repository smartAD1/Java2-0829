package poker;

import java.util.HashSet;
import java.util.Set;

public class Hello41 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(12);// int = Auto-Boxing => Integer
		set.add("Brod");
		set.add(15);
		set.add(new Student(2,5,6));
		set.add(new Student(2,5,6));
		System.out.println(set.size());
		System.out.println(set.toString());
	}

}
