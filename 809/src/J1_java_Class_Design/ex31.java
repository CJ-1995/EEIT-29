package J1_java_Class_Design;

public class ex31 {

	public static void main(String[] args) {
		Product p1=new Product("PowerCharger");
		Product p2=p1;
		System.out.println(p1.equals(p2));
		Product p3=new Product("PowerCharger");
		System.out.println(p1.equals(p3));

	}

}
class Product {
	String pname;
	public Product(String pname) {
		this.pname=pname;	
	}

}
/*
Given:
class Product {
	String pname;
	public Product(String pname) {
		this.pname=pname;	
	}

}

and the code fragment:

Product p1=new Product("PowerCharger");
Product p2=p1;
System.out.println(p1.equals(p2));
Product p3=new Product("PowerCharger");
System.out.println(p1.equals(p3));

A) true
   false
   
B) true
   true
   
C) false
   false
   
D) false
   true
   
   
ans:A





*/