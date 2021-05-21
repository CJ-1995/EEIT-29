package j2_Advance_java_Class_Design;

public class ex22 {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.read("Java Programming");
		Book b2=new EBook();
		b2.read("http://ebook.com/ebook");

	}

}
class Book{
	 String read(String bname){return "Read "+ bname;}
}
class EBook extends Book{
	public String read(String url){return "View "+url;}
}

/*
Given:

Book.java:
public class Book{
	private String read(String bname){return "Read "+ bname;}
}

EBook.java:
public class EBook extends Book{
	public String read(String url){return "View "+url;}
}

Test.java:
public class Test{
	public static void main(String[] args){
		Book b1=new Book();
		b1.read("Java Programming");
		Book b2=new EBook();
		b2.read("http://ebook.com/ebook");
	
	}

}
What is the result?

A) The Test.java file fails to compile.

B) The Ebook.java file fails to compile.

C) Read Java Programming
   Read http:/ebook.com/ebook
   
D) Read Java Programming
   View http:/ebook.com/ebook
   
   ans:A



*/