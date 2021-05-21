package j6Java_IO_Fundamentals;

import java.io.Console;

public class ex5 {

	public static void main(String[] args) {
		Console console=System.console();
		char[] pass=console.readPassword("Enter password:"); // line n1
		String password=new String(pass); // line n2
		
	}

}
/*
Given the code fragment:

public static void main(String[] args) {
	Console console=System.console();
	char[] pass=console.readPassword("Enter password:"); // line n1
	String password=new String(pass); // line n2
}

What is the result?

A) A compilation error occurs at line n2

B) A compilation error occurs because the IOException isn't declared to be thrown or caught.

C) The code reads the password without encoding characters on the console.

D) A compilation error occurs at line n1.

ans:C







*/