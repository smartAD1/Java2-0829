package poker;

public class Hello12 {

	public static void main(String[] args) {
				int a = 10;
				final int b = 8; //加入final則可以正常使用在 CASE後面也可加法 但不能與A相等
				switch(a){
				case 1:
					System.out.println("A");
				break;//如果省去break會直接往下一層做
				
				case b+2 :
					System.out.println("B");
				break;
				
				case 100:
					System.out.println("C");
				break;
				
				default:
					System.out.println("D");
					break;
				}
				
			

	}

}
