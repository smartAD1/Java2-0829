package poker;

public class Hello15 {//99乘法表

	public static void main(String[] args) {
		
		for (int k = 0; k < 2; k++) {//用三層FOR迴圈去計算
			for (int j = 1; j <= 9; j++) {//計算9層 例2*9為止
				for (int i = 2; i <= 12; i++) {//計算總層數 共有12層
					int re = i * j;
					System.out.print(i + "x" + j + "=" + re + "\t");//算出i+x+j=re的值

				}
				System.out.println();
			}
			System.out.println("----");
		}

	}
}