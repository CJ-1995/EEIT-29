package ch1_javaBasic;

public class ex1 {

	public static void main(String[] args) {
		 String s = "A";
		 
	        switch (s) {
	            case "a":
	                System.out.println("simaple A ");
	            
	            case "A":
	                System.out.print("Capital A ");
	            default:
	                System.out.print("default ");
	        }
		
		
	}
}

/*
 Given:

public class Whizlabs {
 
    public static void main(String[] args) {
        String s = "A";
 
        switch (s) {
            case "a":
                System.out.println("simaple A ");
            default:
                System.out.print("default ");
            case "A":
                System.out.print("Capital A ");
        }
    }
}

What is the result?

A.

simaple A

B.

Capital A

C.

simaple A default Capital A

D.

simaple A default

E. Compilation fails.
 
 
 
 
 */
