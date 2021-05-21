package j12Java_Stream_API;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the code fragment:

List<String> words=Arrays.asList("win","try","best","luck","do");
Predicate<String> test1=w->{
	System.out.println("Checking...");
	return w.equals("do");				//line n1

};

Predicate test2=(String w)->w.length()>3; //line n2

words.stream()
	 .filter(test2)
	 .filter(test1)
	 .count();
	 
What is the result?

A) Checking...
   Checking...
   
B) Checking...

C) A compilation error occurs at line n1

D) A compilation error occurs at line n2


ans:D



*/