package func;

import com.sun.org.apache.bcel.internal.generic.StackConsumer;

public class TestFunc {

	public static void main(String[] args) {
		
//------------void----------
			add1(1, 1);//沒有回傳值 
			
				
//------------return------------
		int sum = add(1 , 1);
		System.out.println(sum);
		}
//-------------return(Func)-----------------------
	public static int add(int a , int b) {
		
		int c = a + b; 
	 return c;
	}

//------------void(Func)----------
	
// void:表示此方法沒有回傳 單純只是要執行內的程式!
public static void add1(int a , int b) {
		
		int c = a + b; 
		System.out.println("c="+c);
}
}
