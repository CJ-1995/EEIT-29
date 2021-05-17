package inner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class ClassA {

	private double height = 0;
	private double weight = 0;

	public ClassA(double height ,double weight) {
		this.weight = weight;
		this.height = height;
	}
	
	public void printBMU() {
		InnerClass inner= new InnerClass();
		double bmi = inner.calcBMI();//alt + shit + l
		System.out.println(bmi);
	}
	private class InnerClass{
		public double calcBMI() {
			return weight / (height * height);
		}
	}
	
}
