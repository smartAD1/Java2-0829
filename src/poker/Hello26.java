package poker;

import javax.swing.JOptionPane;

public class Hello26 {

	public static void main(String[] args) {
		// 1. create Answer 建立謎底
		String answer = createAnswer(6);
		System.out.println(answer);

		// 2. start game
//		  for (int i=0; i<3; i++){
//		 // 3. Guess
//		 String guess = JOptionPane.showInputDialog("Input");
//		
//		// 4. Check ?A?B
//		 String result = checkAB(answer, guess);
//		 JOptionPane.showMessageDialog(null,
//		 guess + ":" + result);
//		 }

		// 5. WINNER / ....
	}

	static String createAnswer(int n) {
		// 洗牌
		int[] poker = new int[n];
		for (int i = 0; i < poker.length; i++) {
			int temp;
			// 檢查機制
			boolean isRepeat;
			do {
				temp = (int) (Math.random() * 10);
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			poker[i] = temp;
		}
		// poker[0], [1], [2]
		String ret = "";
		for (int p : poker)
			ret += p;
		return ret;
	}

	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++){
			if (g.charAt(i) == a.charAt(i)){
				A++;
			}else if (a.indexOf(g.charAt(i))!=-1){
				B++;
			}
		}
		return A + "A" + B + "B";
	}
}