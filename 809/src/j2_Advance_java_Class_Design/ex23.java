package j2_Advance_java_Class_Design;

public class ex23 {

	public static void main(String[] args) {
		Bar d=new Daze();
		d.methodB("hello");	
		
	}

}
class Foo{
	public void methodB(String s) { System.out.println("Foo "+ s);}
}
class Bar extends Foo{
	public void methodB(String s) { System.out.println("Bar "+ s);}
	
}
class Baz extends Bar {
	private Bar bb=new Bar();
	public void methodB(String s){
		bb.methodB(s);
		super.methodB(s);	
	}

}
class Daze extends Bar{
	private Bar bb=new Bar();
	public void methodB(String s){
		bb.methodB(s);
		super.methodB(s);	
	}

}
/*
public class Foo{
	public void methodB(String s) { System.out.println("Foo "+ S);}
}

public class Bar extends Foo{
	public void methodB(String s) { System.out.println("Bar "+ s);}
	
}

public class Baz extends Bar {
	private Bar bb=new Bar();
	public void methodB(String s){
		bb.methodB(s);
		super.methodB(s);	
	}

}

public class Daze extends Bar{
	private Bar bb=new Bar();
	public void methodB(String s){
		bb.methodB(s);
		super.methodB(s);	
	}

}

public class TestClass{
	public static void main(String[] args) {
		Bar d=new Daze();
		d.methodB("hello");	
	}

}


What is the result?

A) Bar Hello
   Bar Hello
   
B) Bar Hello
   Foo Hello
   
C) A compilation error occurs in the Daxe class.

D) Bar Hello


ans:A


*/