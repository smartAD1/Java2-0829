package poker;

public class Hello23 {

	public static void main(String[] args) {
		String a1 = new String();
		byte[] b1 = {97,98,99,100};
		String a2 = new String(b1);
		String a3 = new String(b1,1,2);
		System.out.println(a1);//無數值
		System.out.println(a2);//ASCII碼
		System.out.println(a3);//byte b1的前兩個數字 以0(97)開始算出後面兩個數字98 99
		System.out.println(b1);//記憶體位置
	}

}
