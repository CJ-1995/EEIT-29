package j5Exceptions_and_Assertions;

public class ex19 {

	public static void main(String[] args) {
		MyClass obj=null;
		try(MyClass obj1=new MyClass()) {
			obj1.test=100;
			obj=obj1.copyObject();    // line n1
		}
		System.out.println(obj.test); // line n2
		
	}

}
class MyClass implements AutoCloseable {
	int test;
	public void close() {}
	public MyClass copyObject() { return this; }
}
/*
Given:

class MyClass implements AutoCloseable {
	int test;
	public void close() {}
	public MyClass copyObject() { return this; }
}


and the code fragment:

MyClass obj=null;
try(MyClass obj1=new MyClass()) {
	obj1.test=100;
	obj=obj1.copyObject();    // line n1
}
System.out.println(obj.test); // line n2

What is the result?

A) 100

B) An exception is thrown at line n2

C) A compilation error occurs at line n1

D) A compilaton error occurs because the try block is declared without a catch of finally block


ans:A

*/