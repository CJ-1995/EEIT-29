package equals;

public class TestEquals {
	public static void main(String[] args) {
		
		Employee e1 =new Employee("001");//0800
		Employee e2 =new Employee("001");//0900
		
		System.out.println(e1 == e2);//fales
		System.out.println(e1.equals(e2));
		e1 = null;
		System.gc();
		
		System.out.println(e2);
		System.out.println(e2.toString());
	}
}
