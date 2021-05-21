package j5Exceptions_and_Assertions;

public class ex16 {

	public static void main(String[] args) throws Exception{
		

	}

}


/*
Given:

class DataConverter{
	public void copyFlatFilesToTables(){}
	public void close() throws Exception{
		throw new RuntimeException();//line n1
	}

}

and the code fragment:

public static void main(String[] args) throws Exception{
	try(DataConverter dc=new DataConverter())// line n2
	{ dc.copyFlatFilesToTables();}

}

What is the result?

A) A compilation error occurs at line n1.
B) A compilation error occurs at line n2.
C) A compilation error occurs because the try block doesn't have a catch of finally block.
D) The program compiles successfully.

ans:B

*/