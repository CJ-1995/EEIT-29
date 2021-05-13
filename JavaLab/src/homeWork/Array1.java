package homeWork;

public class Array1 {

	public static void main(String[] args) {
//double[] x1 = {1.1 ,2.0 ,1.2 ,1.4 ,0.5 ,6.0};
//  找出最大值 最小值 平均值
		
		//	最小值
		{
		double[] x1 = {1.1 ,2.0 ,1.2 ,1.4 ,0.5 ,6.0};
		double sum = x1[0] ;
			for(double a : x1) {
				sum=(sum > a ? sum=a : sum);
			}
				System.out.println("最小值="+sum);
		}
		
		//	最大值
		{
		double[] x1 = {1.1 ,2.0 ,1.2 ,1.4 ,0.5 ,6.0};
		double sum = x1[0] ;
			for(double a : x1) {
				sum=(sum < a ? sum=a : sum);
		}
			System.out.println("最大值="+sum);
		
		}
		
		
		//	平均值
		{
		double[] x1 = {1.1 ,2.0 ,1.2 ,1.4 ,0.5 ,6.0};
		double sum=0;
		int i=0;
			for(double a : x1) {
				sum += a;
				i++;
			}
				System.out.println("平均值="+sum/i);
				}
		
		//	聖誕樹  
		int a = 4;
		int b = 4;
//			決定層數
		for(int i = 1;i <= a; i ++) {
//			決定*數
			for(int j = 0 ;j < i ;j ++) {
//					決定空白要幾道幾
//					第一層 左邊三個空白   4   右邊三個空白 
//					第二層 左邊兩個空白  3,4  右邊兩個空白
//					第三層 左邊一個空白 2,3,4 右邊一個空白
//										根本不用理右邊
//					if(    ){				
//              	if( a == b){
//					System.out.print(" ");
//					continue;
//		}
				System.out.print("*");
				
			}
				System.out.println();
		}
		
		
	}
}
