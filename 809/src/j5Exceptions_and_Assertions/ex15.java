package j5Exceptions_and_Assertions;

public class ex15 {

	public static void main(String[] args) {




	}

}

/*
Given:

class Resource implements AutoCloseable{
	public void close() throws Exception{
		System.out.print("Close-");	
	}
	
	public void open()
	{
		System.out.print("Open-");
	}

}

and this code fragment:

Resource res1=new Resource();
try{
	res1.open();
	res1.cloase();
} catch(Exception e){
	System.out.println("Exception -1");
}
try(res1=new Resource()){//line n1
	res1.open();
}catch(Exception e){
	System.out.println("Exception-2");
}

What is the result?
A)A compilation error occurs at line n1.
B)Open-Close-Open-
C)Open-Close-
  Exception -1
  Open-Close-
  
 D)Open-Close-Open-Close
 
 
 
 ans:A
*/