package j2_Advance_java_Class_Design;

public class ex1 {
	 public static void main(String[] args) {
	        USCurrency usCoin = USCurrency.DIME;
	        System.out.println(USCurrency.DIME.getValue());
	    }

}
 
 enum USCurrency {
	 PENNY(1),
	    NICKLE(5),
	    DIME(10),
	    QUARTER(25);
	 private int value; 
	private USCurrency(int value) {
	        this.value = value;
	    }
	 
	  public int getValue() {
	        return value;
	    }

}

 
/*
Given:
public enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;
 
    public USCurrency(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
}
Coin.javaJava

public class Coin {

    public static void main(String[] args) {
        USCurrency usCoin = new USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }
}

Which two modifications enable the given code to compile?

A. Nest the USCurrency enumeration declaration within the Coin class.
B. Make the USCurrency enumeration constructor private.
C. Remove the new keyword from the instantion of usCoin.
D. Make the getter method of value as a static method.
E. Add the final keyword in the declaration of value.




*/