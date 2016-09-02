package poker;
public class Hello29 {
	public static void main(String[] args) {
		H30 obj1 = new H30();
		H31 obj2 = new H31();
		
		H36 obj3 = new H36();
		obj3.m3(obj1);
	}
	
}
interface H291{
	void m1();
	void m2();
}
class H30 implements H291{
		public void m1(){System.out.println("H291:m1()");}
		public void m2(){System.out.println("H291:m2()");}
}
class H31 implements H291{
	public void m1(){System.out.println("H30:m1()");}
	public void m2(){System.out.println("H30:m2()");}
}
class H36 {
	void m3 (H291 b){
		b.m1();
	}
}
