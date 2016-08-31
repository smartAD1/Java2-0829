package poker;

public class Hello23 {

	public static void main(String[] args) {
		String a1 = new String();
		byte[] b1 = {97,98,99,100};
		String a2 = new String(b1);
		String a3 = new String(b1,1,2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(b1);
	}

}
