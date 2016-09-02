package poker;

public class Hello27 {

		public static void main(String[] args) {
			Brad271 obj1 = new Brad271(2);
//			obj1.m1();
			Brad272 obj2 = new Brad272();
//			obj2.m1();
//			obj2.m2();
		}
	}
	class Brad271{
		int a;
		Brad271(int b){
			// super()
			System.out.println("Brad271()");
		}
		void m1(){System.out.println("Brad271:m1()");}
	}
	class Brad272 extends Brad271 {
		Brad272(){
//			super(1)
			super(2);
		}
		void m1(){
			super.m1();
			System.out.println("Brad272:m1():" + a);
		}
		void m2(){System.out.println("Brad272:m2()");}
	}