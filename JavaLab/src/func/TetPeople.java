package func;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TetPeople {

	public static void main(String[] args) {

		People p = new People();
		p.height = 1.7;
		p.weight = 70;
		System.out.printf("BMI=%.2f\n",p.getBMI());
		System.out.println("過重BMI="+People.overWeight);
	
		double bmi = People.BMI(1.7,70);
		System.out.println("static BMI="+bmi);
//------------靜態方法------------		
		System.out.println(Math.pow(2, 5));
		System.out.println( String.join("-", "0800","000","000"));
	
	}


}
