package poker;

public class Hello15 {

	public static void main(String[] args) {//99乘法
		int i = 1;
		int j = 1;
		int k = 2;
		for (k = 0; k < 2; k++) {
			for (j = 1; j <= 9; j++) {
				for (i = 2; i <= 12; i++) {
					int re = i * j;
					System.out.print(i + "x" + j + "=" + re + "\t");

				}
				System.out.println();
			}
			System.out.println("----");
		}

	}
}