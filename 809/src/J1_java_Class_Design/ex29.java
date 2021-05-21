package J1_java_Class_Design;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

public class Product {
	public double applyDiscount(double price) {
		assert (price>0);// line n1
		return price*0.50;
	
	}
	
	public static void main(String[] args) {
		Product p=new Product();
		double newPrice=
			p.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price:"+newPrice);	
	}

}

and the command:

java Product 0

What is the result?

A) An AssertionError is thrown.

B) A NumberFormatException is thrown at run time.

C) New Price: 0.0

D) A compilation error occurs at line n1


ans: C


*/