package array;

import sun.print.resources.serviceui;

public class TestArray2 {

	public static void main(String[] args) {

		int [][] x= { {1,2,3} , {4,5,6} };
					// 第一排       第二排

//		int [][] x=new int[5][4];
//		//[][] 第一個數字代表排 第二個數字代表行
//		x[0][1] = 20;
//		x[1][1] = 40;
		
//		System.out.println(x[0][1]);
//		System.out.println("有幾排="+x.length);
//		System.out.println("第一排有幾個="+x[0].length);

		// i代表第幾排		j代表第幾行
		for(int i=0 ;i < x.length ; i++) {
			for(int j = 0 ;j < x[i].length ; j++) {
				System.out.println(x[i][j]);
				
			}
		}
		
		for(int[] a : x ) {
			for(int b : a ) {
				System.out.println(b);
			}
		}
		
	}

}
