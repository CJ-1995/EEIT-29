package j5Exceptions_and_Assertions;

public class ex18 {
	
	public static void doStuff(String s) {
		try{
			if(s==null){
				throw new NullPointerException();			
			}
		
		} finally{
			System.out.println("-finally-");		
		
		}
		System.out.println("-doStuff--");	
	}
	
	public static void main(String[] args)
	{
		try{
			doStuff(null);
			/*try{
				if(s==null){
					throw new NullPointerException();			
				}
			
			} finally{
				System.out.println("-finally-");		
			
			}
			System.out.println("-doStuff--");	
			*/
		} catch(NullPointerException npe) {
			System.out.println("-catch-");		
		}
	 
	 }


}
/*
Given:

public class StrMan {
	public static void doStuff(String s) {
		try{
			if(s==null){
				throw new NullPointerException();			
			}
		
		} finally{
			System.out.println("-finally-");		
		
		}
		System.out.println("-doStuff--");	
	}
	
	public static void main(String[] args)
	{
		try{
			doStuff(null);
		} catch(NullPointerException npe) {
			System.out.println("-catch-");		
		}
	 
	 }

}

What is the result?

A) -finally-
   -dostuff-
   -catch-
   
B) -catch-

C) -catch-
   -finally-
   -dostuff-
   
D) -finally-
   -catch-
   
   
ans:D

*/