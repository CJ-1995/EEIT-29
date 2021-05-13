import java.util.Iterator;

public class Test_For {

	public static void main(String[] args) {
//------------------for--------------
	int sumOfFor=0;
	for(  int i = 1 ; i <= 100 ; i ++ ) {
		if( i % 2 == 0 ) {
			continue;    
			//忽略迴圈區塊內 下方的程式 直接繼續下一次迴圈
		}
//		if( i > 50) {
//			break;   
//			//跳出迴圈
//		}
		System.out.print(i+" ");
		sumOfFor=sumOfFor+i;
		}
	System.out.println("For of sum的總和"+sumOfFor);
System.out.println("------------------------------");

//------------------whle--------------
	
		int i=0;
		int sumOfWhile=0;
		while (i<=100) {
		sumOfWhile=sumOfWhile + i;
		System.out.print(i+" ");
			i+=2;
		}
		System.out.println("sumOfWhile is"+sumOfWhile);

		System.out.println("------------------------------");

//------------------do whle--------------
		
		 int j = 1 ;
		 int sumOfDoWhile = 0 ;
		 do {
			sumOfDoWhile=sumOfDoWhile + j ;
			System.out.print(j+" ");
			j++;
		} while ( j <= 100);
		System.out.println("Do While ="+sumOfDoWhile);

	
	}
}


