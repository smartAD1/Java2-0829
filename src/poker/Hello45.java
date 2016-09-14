package poker;

public class Hello45 {

	public static void main(String[] args) {
		Hello451 obj = new Hello451("A");
		Hello451 obj1 = new Hello451("B");
		Hello452 obj2 = new Hello452("C");
		Thread t1 = new Thread(obj2);
		obj.start();
		obj1.start();
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println("main");
		obj1.interrupt();
	}
}

class Hello451 extends Thread {
	String neme;

	Hello451(String neme) {
		this.neme = neme;
	}

	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(neme + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
	class Hello452 implements Runnable {
		String neme;

		Hello452(String neme) {
			this.neme = neme;
		}
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(neme + ":" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
}
