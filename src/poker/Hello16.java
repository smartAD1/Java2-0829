package poker;

public class Hello16 {

	public static void main(String[] args) {//計算質數

		for (int i = 1; i <= 100; i++) {//列出1到100的樹木
			boolean isP = true;//布林值成立後則計算能否被1或者本身整除 如不能則會以*號標記
			for (int j = 2; j<=i/2; j++) {
				if(i%j==0){
				isP = false;
				break;

			}

		}
		System.out.print(i + (isP?"*":" ") + "  ");
		if (i % 10 == 0)System.out.println();
	}
	}
}
