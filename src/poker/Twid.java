
package poker;

public class Twid {
	private String id ;
	static String check = "ABCDEFGHJKLMNPQRSTUVWXYZIO";//全部縣市身分證英文開頭
	public Twid(){
		this((int)(Math.random()*26));//26個英文
		}
	public Twid(boolean gender){//gender 性別
		this(gender,(int)(Math.random()*26));
	}
	public Twid(int area){ //area 地區
		this((int)(Math.random()*2)==0?true:false,area); //成立就是地區 
	}
	public Twid(boolean gender,int area){
		String temp = check.substring(area, area+1); //地區 地區+1
		temp+= gender?"2":"1";
		temp+= (int)(Math.random()*10);
		temp+= (int)(Math.random()*10);
		temp+= (int)(Math.random()*10);
		temp+= (int)(Math.random()*10);
		temp+= (int)(Math.random()*10);
		temp+= (int)(Math.random()*10);
		temp+= (int)(Math.random()*10);
		for(int i=0;i<10;i++){//使用for迴圈去計算身分證有沒有通物驗證機制
			if(isRight(temp+i)){
				id = temp +i;
				break;
			}
		}
	}
	
	public String getId(){return id;} 
	public Twid(String id){
		this.id=id;
	}
	
	int getArea(){
		return 1;
	}
		
		boolean getGender(){//判定性別
			return id.charAt(1)==2;
		}
	static	 boolean isRight(String id){
			boolean ret = false;
			if(id.matches("^[A-Z][12][0-9]{8}$")){
				
				int pos = check.indexOf(id.charAt(0));//隨機產身分證數字9碼
				int n12 = pos +10;
				int n1 = pos  / 10;
				int n2 = pos %10;
				int n3 = Integer.parseInt(id.substring(1, 2));
				int n4 = Integer.parseInt(id.substring(2, 3));
				int n5 = Integer.parseInt(id.substring(3, 4));
				int n6 = Integer.parseInt(id.substring(4, 5));
				int n7 = Integer.parseInt(id.substring(5, 6));
				int n8 = Integer.parseInt(id.substring(6, 7));
				int n9 = Integer.parseInt(id.substring(7, 8));
				int n10 = Integer.parseInt(id.substring(8, 9));
				int n11 = Integer.parseInt(id.substring(9, 10));
				int sum = n1*1 +n2 *9 +n3 *8 + n4 * 7 +n5 * 6 + n6* 5+
						n7 * 4 +n8 * 3 + n9 *2 +n1 *1 + n11*1;
				ret = sum %10==0;
			
				ret = true;
				
			}
		return ret;
}
		
}


