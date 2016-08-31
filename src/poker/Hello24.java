package poker;

public class Hello24 {

	public static void main(String[] args) {
		String s1 = "TEXT";
		String s2 = "TEXT";
		String s3 = new String("TEXT");
		String s4 = new String("TEXT");
		System.out.println(s1==s2);
		System.out.println(s4.equals(s3));
		Bkie s6 = new Bkie();
		Bkie s5 = new Bkie();//沒有比對到字串所以=false
		System.out.println(s5.equals(s6));
	}

}
