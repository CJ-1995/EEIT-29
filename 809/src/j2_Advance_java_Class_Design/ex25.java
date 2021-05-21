package j2_Advance_java_Class_Design;

public class ex25 {

	public static void main(String[] args) {
		
		System.out.println(Book2.get());
		System.out.println(Book2.get());
	}

}
class Book2
{
	private static Book2 b=new Book2();
	
	private  Book2()
	{
		
	}
	
	public static Book2 get()
	{
		return new Book2();
	}
	
}

/*
Which two are elements of a singleton class?

A) a private constructor to the class

B) a public reference to point to the single instance//指向單個實例的公共引用

C) a transient reference to point to the single instance//指向單個實例的瞬時引用

D) a public method to instantiate the single instance//實例化單個實例的公共方法

E) a public static method to return a copy of the singleton reference//一個公共靜態方法，以返回單例引用的副本


ans:A,B


*/