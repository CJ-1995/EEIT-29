package j10Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=15;
		Locale l=new Locale("en","US");
		NumberFormat formatter=NumberFormat.getCurrencyInstance(l);
		System.out.println(formatter.format(d));

	}

}
/*
Given the information:

LOcale  Currency Symbol Currency Code
US      $        USD

and the code fragment:

double d=15;
Locale l=new Locale("en","US");
NumberFormat formatter=NumberFormat.getCurrencyInstance(l);
System.out.println(formatter.format(d));

What is the result?

A) USD 15.00

B) $15.00

C) USD $15

D) 15 $


ans:B
  
  






*/