package poker;

public class Hello20 {

	public static void main(String[] args) {
		//a[]<一維陣列,a[][]二維陣列, 
		//b =new  int[1][2]
		//四維陣列 以樹狀圖呈現
		
		int [] [] a;
		int [] b [];
		//int c [] [4];
		
		a = new int [3] [4];
		b = new int [3] [];
		b [0] = new int [2];
		b [1] = new int [3];
		b [2] = new int [4];
		
		b[0][1] = 1;
		b[1][2] = 2;
		b[2][3] = 3;
//		for (int i = 0; i < b.length; i++) {
//			for (int j = 0; j < b[i].length; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
		for(int[] v:b){//簡略型寫法
			for(int vv:v){
				System.out.print(vv + " ") ;
			}
			System.out.println();
		}
		
		int[] e = new int []{1,2,3,4,5};
		System.out.println(e[2]);
		int[] f = {1,2,3,4,5};
		System.out.println(f.length);
	}

	
}
