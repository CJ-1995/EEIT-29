import com.sun.swing.internal.plaf.basic.resources.basic;
import com.sun.xml.internal.fastinfoset.algorithm.IEEE754FloatingPointEncodingAlgorithm;

public class TestBasic {

	public static void main(String[] args) {

		long salary = 9999999;
		salary = 50000;
		System.out.println("salary=" + salary);

		int i = 7, j = 2, k = 3;
		// 變數沒有給值 是不能使用的
		System.out.println(i = j + k);
		System.out.println(222222222 * 10);

		char c = '陳';
		System.out.println(c);

		boolean d = true;
		System.out.println(d);

		// 8大基本型態 4整數(byte,short,int,long) 2浮點數(folat,double),char,boolean!!

		System.out.println("ha\r\nha\r\nha");
		System.out.println();

		int x = 10, y = 3;
		int z = x * y;
		System.out.println("z=" + z);
		System.out.println("x/y=" + x / y);
		System.out.println();

		short xx = 10, yy = 3;
		int zz = xx + yy;

		double xxx = 10.0;
		int yyy = 3;
		double zzz = xxx + yyy;
		System.out.println("\\");
		
		double az=10.5;
		int as=(int)az;
		System.out.println(as);
		
		int age =26;
		boolean Adult=age>18 || age<18;
			System.out.println(Adult);
			
			System.out.println( 2 << 2);//<<*2n
			
//			age;
			System.out.println("age is"+  (age++) +","+ age );
			
		age+=7;
	System.out.println(age);
	//------------三元運算---------------
	System.out.println(age>=18?"妹子":"羅莉");
	{
	int banan=10;
	int 錢包=50;
	System.out.println(錢包>banan?"吃":"吃土");
	}
	}

}
