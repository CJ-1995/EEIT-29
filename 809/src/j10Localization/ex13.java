package j10Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex13 {
	public void loadResourceBundle(){
		ResourceBundle resource=ResourceBundle.getBundle("Messages_en",Locale.US);
		System.out.println(resource.getObject("msg"));	
	}
	public static void main(String[] args) {
		new ex13().loadResourceBundle();	
	}

}
/*
Given the Greetings.properties file, containing:

HELLO_MSG=Hello,everyone!
GOODBYE_MSG=Goodbye everyone!

and given:

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesApp{
	public void loadResourceBundle(){
		ResourceBundle resource=ResourceBundle.getBundle("Greeting",Locale.US);
		System.out.println(resource.getObject(1));	
	}
	public static void main(String[] args) {
		new ResourcesApp().loadResourceBundle();	
	}

}

What is the result?

A) HELLO_MSG

B) GOODBYE_MSG

C) Hello, everyone!

D) Goodbye everyone!

E) Compilation fails.


ans:E



*/