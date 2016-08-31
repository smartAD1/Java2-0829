package poker;

public class Hello25 {

	public static void main(String[] args) {
			Twid id = new Twid(true, 11);//true後面數字是選擇第幾個城市沒有則以id.getId()隨機產生
			System.out.println(id.getId());
		if (Twid.isRight(id.getId())) {
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}
	}

}
