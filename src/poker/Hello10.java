package poker;

public class Hello10 {

	public static void main(String[] args) {
		 int year  = 20;
		 int mouth = 2;
         //設定欲判斷之年        

        System.out.print(year);
        if (year%4==0)//可被4除盡
        	
        if(year%100==0)
        	
        if(year%400==0){
        	
        }
        else{
        	System.out.println("不是閏年！");
        }
        else{
        	System.out.println("是閏年！");
        }
        else{
        	System.out.println("不是閏年！");
        }
        
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