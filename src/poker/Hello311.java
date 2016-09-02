package poker;

public class Hello311 {

	public static void main(String[] args) {
		 int a = 10 ,b = 3;
		 int d [] = {1,2,3,4};
				 try{
					 int c = a / b ;
					 System.out.println(c);
					 System.out.println(d[4]);
				  }catch (ArithmeticException ae ){
					 System.out.println("H");
				 }catch (ArrayIndexOutOfBoundsException r){
					 System.out.println("H");
				 }catch (RuntimeException ae){
					 System.out.println("OK");
				 } 
				 System.out.println("Game over");
	}

}
