package poker;

public class Hello24 {

	public static void main(String[] args) {
		String s1 = "TEXT";//與s2是相同位置字串
		String s2 = "TEXT";
		String s3 = new String("TEXT");//與s4記憶體位置不同但使用equals檢查字串
		String s4 = new String("TEXT");
		System.out.println(s1==s2);//與s2是相同位置字串
		System.out.println(s4.equals(s3));
		Bkie s6 = new Bkie();//沒有比對到字串所以=false,位置也不同
		Bkie s5 = new Bkie();
		System.out.println(s5.equals(s6));
	}

}
