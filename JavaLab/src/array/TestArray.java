package array;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

public class TestArray {

	public static void main(String[] args) {
		
		int[] ages = {1,2,3};

//		int[] ages = new int[10];
//		ages[0] = 1; //起始位置是 0 
//		ages[1] = 2;
//		ages[2] = 3;
		

		System.out.println(ages[1]);
		System.out.println("length=" + ages.length);
		
		ages=null;
	
//------------進階型for迴圈----------
		//  for( 宣告 : 陣列 )
		for(int a:ages) {
			System.out.println(a);

		}
		
	}

}
