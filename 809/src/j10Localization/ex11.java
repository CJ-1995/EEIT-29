package j10Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale locale=new Locale.Builder().setLanguage("en").setRegion("FR").build();
		 Locale locale=new Locale("zt","FR");
		Locale.setDefault(locale);
		 ResourceBundle resource=ResourceBundle.getBundle("Messages");
		 System.out.print(resource.getString("msg"));

	}

}
/*
Given that these files exist and are accessible:

/resources/Messages.properties
/resources/Messages_en.properties
/resources/Messages_FR.properties
/codes/Test.java
 
and given the content of the files:

Messages.properties:
msg=Good day!

Messages_en.properties:
msg=welcome!

Messages_FR.properties:
msg=Bienvenue!

and given the code fragment from the Test.java file:

12 Locale locale=new Locale.Builder().setLanguage("en").setRegion("FR").build();
13 Locale.setDefault(locale);
14 ResourceBundle resource=ResourceBundle.getBundle("resources.Messages");
15 System.out.print(resource.getString("msg"));


what is the result?

A) Good day!
B) Bienvenue!
C) Welcome!
D) A MissingResourceException is thrown at run time.


ans:D

*/