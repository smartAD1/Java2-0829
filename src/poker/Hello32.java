package poker;

public class Hello32 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		try{
			b1.setLeg(-2);
		}catch(Exception ee){
			//
		}
	}
}
class Bird {
	int leg;
	void setLeg(int n) throws Exception {
		if (n<0 || n>2){
			throw new RuntimeException();
		}
		leg = n;
	}
}