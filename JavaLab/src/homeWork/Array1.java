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
				sum=(sum > a ? sum= a : sum);
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
		int line = 4;
		int b = 4;
//			決定層數
		for(int i = 1;i <= line; i ++) {
//			決定*數
			for(int j = 1 ;j < line-1 ;j ++) {
//					
				System.out.print(" ");
			}
				System.out.print("*");
				
			}
				System.out.println();
		}
		
		
	}

