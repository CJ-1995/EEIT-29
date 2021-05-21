package j7Java_File_IO_NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path ip=Paths.get("/data","First.txt");
		System.out.println(ip);
		 
	}

}
/*
Given the code fragment:

//line n1

System.out.println(ip);


Which code fragment, when inserted at line n1,enables the code to print /First.txt?

A) Path ip=Paths.get("/","First.txt");

B) Path ip=new Paths("/First.txt");

C) Path ip=new Path("/First.txt");

D) Path ip=Paths.toPath("First.txt");


ans:A

*/