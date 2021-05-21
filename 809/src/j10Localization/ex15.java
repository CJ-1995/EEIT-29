package j10Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale currentLocale=new Locale.Builder().setLanguage("aa").setRegion("FR").build();
		Locale  currentLocale=new Locale("aa","FR");
		ResourceBundle messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
		System.out.println(messages.getString("inquiry"));
	}

}
/*
Given the content:

MessagesBundle.properties file:

inquiry=How are you?

MessagesBundle_de_DE.properties file:

inquiry=Wie geht's?

and given the code fragment:

Locale currentLocale;
//line 1
 
ResourceBundle messages=ResoyrceBundle.getBundle("MessagesBundle",currentLocale);
System.out.println(messages.getString("inquiry"));

Which two code fragments, when inserted at line 1 independently, enable the code to print "Wie
gent's?"

A) currentLocale=Locale.GERMAN;

B) currentLocale=new Locale.Builder().setLanguage("de").setRegion("DE").build();

C) currentLocale=Locale.getInstance(Locale.GERMAN,Locale.GERMANY);

D) currentLocale=new Locale("de","DE");

E) currentLocale=new Locale();
   currentLocale.setLanguage("de");
   currentLocale.setRegion("DE");
   
   
ans:B,D

*/