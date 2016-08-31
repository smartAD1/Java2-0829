package poker;

public class Bkie {

	private double speed;//速度封裝
	private int color; //顏色封裝
	
	Bkie(){//初始化顏色
		System.out.println("Bike()");
		color = 2;
	}
	Bkie(int c){ //初始化顏色
		System.out.println("Bike(int)");
		color = c;
	}
	
	void upSpeed(){//如速度小於1就等於1不然就是速度*1.9倍
		speed = (speed<1?1:speed*1.9);
	}
	
	void upSpeed(int gear){//如速度小於1就等於1不然就是速度*1.9倍+上三倍速
		speed = (speed<1?1:speed*(1.9+gear));
	}
	void downSpeed(){//如果速度小於1就是等於0不然就是速度*上0.7倍速
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
