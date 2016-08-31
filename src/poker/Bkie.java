package poker;

public class Bkie {

	private double speed;
	private int color;
	
	Bkie(){
		System.out.println("Bike()");
		color = 2;
	}
	Bkie(int c){
		System.out.println("Bike(int)");
		color = c;
	}
	
	void upSpeed(){
		speed = (speed<1?1:speed*1.9);
	}
	
	void upSpeed(int gear){
		speed = (speed<1?1:speed*(1.9+gear));
	}
	void downSpeed(){
		speed = (speed<1?0:speed*0.7);
	}
	double getSpeed(){
		return speed;
	}
	@Override
	public String toString() {
	
		return "MIT BIKE";
	}
	
}
