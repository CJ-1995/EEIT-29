package exception;

public class TestException {

	public static void main(String[] args) {
		try {
		int a = 1;
		int c = 1;
//		System.out.println("c="+c--);
		
		int b = a / c ;
		System.out.println("b="+b);
		
		int[] x = {};
		System.out.println(x[0]);
		//RintimeException子類別 是不需要處理的
		}catch (ArithmeticException ex) {
			System.out.println("Exception:程式除到0");
			ex.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception:陣列索引值超過邊界");
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();

		}finally {
			System.out.println("Finally是一定會被執行的程式區塊");
		}
		System.out.println("finish");
	}
}
