package poker;

public class Hello11 {
	public static void main(String[] args) {
		int a =8, b=2 ;
		
		if(a++<=10 && b-->=3){//如果A++等於10或11就是OK 如果大於10或就是XX
		System.out.println("OK:a="+a+",b="+b);//B則小於0就是不OK
		}
		else
		{
			System.out.println("XX:a="+a+",b="+b);
		}
		
	}
}
