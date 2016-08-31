package poker;

public class Hello18 {//計算骰子骰一百次後各點數出現幾次

	public static void main(String[] args) {
		 int a1,a2,a3,a4,a5,a6;
		     a1=a2=a3=a4=a5=a6=0;
		 for(int i=1;i<=100;i++){//使用FOR迴圈骰一百次計算
			 int point =(int)(Math.random()*6+1);//使用無陣列的骰子 骰一百次的次數
			 switch(point){
			 case 1: a1++; break;
			 case 2: a2++; break;
			 case 3: a3++; break;
			 case 4: a4++; break;
			 case 5: a5++; break;
			 case 6: a6++; break;
			 }
		 }
		 System.out.println("1點出現"+a1+"次");
		 System.out.println("2點出現"+a2+"次");
		 System.out.println("3點出現"+a3+"次");
		 System.out.println("4點出現"+a4+"次");
		 System.out.println("5點出現"+a5+"次");
		 System.out.println("6點出現"+a6+"次");
	}
}