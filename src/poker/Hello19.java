package poker;

public class Hello19 {

	public static void main(String[] args) {
		int[] a = new int[6];
		for (int i = 0; i < 1000; i++) {
			int point = (int) (Math.random() * 9);// 使用陣列的骰子 
			a[point>=6?point-3:point]++;//使用陣列讓超過的7,8,9點數算入 4 5 6的點數進去
		}
		for(int i=0; i<a.length; i++)
		System.out.println((i+1) + "點出現" + a[i] + "次");

	}
}