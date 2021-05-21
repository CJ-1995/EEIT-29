package J1_java_Class_Design;

public class ex30 implements Interface1, Interface2{

	public static void main(String[] args)
	{
		Interface1 obj=new ex30();
		obj.sayHi();		
		
	}
	public void sayHi() {
		System.out.println("Hi MyClass");	
	}

}
interface Interface1 {
	public default void sayHi() {
		System.out.println("Hi Interface-1");	
	}
 
}

interface Interface2 {
	public default void sayHi() {
		System.out.println("Hi Interface-2");	
	}
}
/*
Given:
interface Interface1 {
	public default void sayHi() {
		System.out.println("Hi Interface-1");	
	}
 
}

interface Interface2 {
	public default void sayHi() {
		System.out.println("Hi Interface-2");	
	}
}

public class MyClass implements Interface1, Interface2 {
	public static void main(String[] args)
	{
		Interface1 obj=new MyClass();
		obj.sayHi();		
		
	}
	public void sayHi() {
		System.out.println("Hi MyClass");	
	}

}

what is the result?

A) Hi MyClass

B) Hi Interface-2

C) A compilation error occurs.

D) Hi Interface-1


ans:A
*/