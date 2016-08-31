package poker;

public class Hello13 {

	public static void main(String[] args) {
		int mouth = 2;
		switch(mouth){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31");
		break;//如果省去會直接往下一層做
		case 2 :
			System.out.println("29");
		break;
		
		case 4: case 6: case 9: case 11: //可直接在同一行打多個case去指定SYSTEMOUT
			System.out.println("30");
		break;
		

		
		
		
		}

	}

}
