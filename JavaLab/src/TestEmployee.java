
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
			emp.empno=1;
			emp.name="Vincent";
	
		Employee emp2=new Employee();
			emp2.empno=2;
			emp2.name="Mary";
		
		System.out.println("Name:"+emp.name+"\tempno:"+emp.empno);
		System.out.println("Name:"+emp2.name+"\tempno:"+emp2.empno);

		System.out.println( emp == emp2 );
			//記憶體位置不相同  0800 != 0900 結果:false

		emp2=emp; //emp2 被emp 覆蓋
		System.out.println( emp == emp2 );
		//  				0800 == 0800
;
//		emp2=null; //null 把emp2的記憶體位置清除
//		System.out.println("Name:"+emp2.name+"\tempno:"+emp2.empno);
		
	}

}
