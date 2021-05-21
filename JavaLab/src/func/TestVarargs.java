package func;

public class TestVarargs {

	public static void main(String[] args) {

		
		int sum = add(1,2,3,4,5);
		System.out.println(sum);
		
	}

	
	
	public static int add (int... values) { //...代表沒有回傳值得數量限制
		int sum = 0;
		for(int item : values) {
			sum += item;
		}
			return 0;
	}
	
	
	
	
}
