package J1_java_Class_Design;

public class ex10 {
	 
	 public static void main(String[] args){
	        String product = "Pen";
	       product.toLowerCase();
	       
	        product.concat(" BOX".toLowerCase());
	        
	      System.out.print(product.substring(4, 6));
	    }

}
/*
 Given:
public class Case{
    public static void main(String[] args){
        String product = "Pen";
        product.toLowerCase();
        product.concat(" BOX".toLowerCase());
        System.out.print(product.substring(4, 6));
    }
}

What is the result?

A.box

B.nbo

C.bo

D.nb

E. An exception is thrown at runtime


*/