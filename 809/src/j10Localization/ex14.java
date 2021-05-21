package j10Localization;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale currentLocale=new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		ResourceBundle messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
		
		Enumeration<String> names=messages.getKeys();
		while(names.hasMoreElements()) {
			String key=names.nextElement();
			String name=messages.getString(key);
			System.out.println(key+"="+name);
		}
		

	}


}
/*
Given the content:

MessagesBundle.properties file:

username=Enter User Name
password=Enter Password


MessagesBundle_fr_FR.properties file:

username=Enterz le nom d'utilisateur
password=Entrez le mot de passe


and the code fragment:

Locale currentLocale=new Locale.Builder().setRegion("FR").setLanguage("fr").build();
ResourceBundle messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
Enumeration<String> names=messages.getKeys();
while(names.hasMoreElements()) {
	String key=names.nextElement();
	String name=messages.getString(key);
	System.out.println(key+"="+name);
}

What is the result?

A) username=Entrez le nom d'utilisateur
   password=Entrez le mot de passe
   
B) The program prints nothing

C) A compilation error occurs.

D) username=Enter User Name


ans:A


*/