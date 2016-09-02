package poker;

public class Hello33 {

	public static void main(String[] args) {
		Hello333 obj1 = new Hello333();
		obj1.m1();

	}
}

class Hello333 {
	void m1() {
		int a = 10, b = 3;
		try {
			System.out.println(a / b);
			
		} catch (Exception e) {
			System.out.println("Brod");
	
		} finally {
			System.out.println("Finally");
			
		}
		System.out.println("Game over");
	}
}
