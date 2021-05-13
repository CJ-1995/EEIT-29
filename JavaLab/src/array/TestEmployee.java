package array;

import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[2];

//		Employee emp1=new Employee();
//		emp1.name = "Vincent";
//		emp1.empno = 1;
//		emps[0] = emp1;
		
		emps[0] = new Employee();
		emps[0].name = "Vincent";
		emps[0].empno = 1;
	//差別在於 沒有新增一個emp1存放Stack中	

		Employee emp2=new Employee();
		emp2.name = "David";
		emp2.empno = 2;
		emps[1] = emp2;
		//物件形式的陣列 存放得是記憶體位置 	
		for (int i=0; i< emps.length; i++) {
			System.out.println(emps[i].name);
		}
	}
}
