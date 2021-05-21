package j3Generics_and_Collections;

import java.util.Arrays;
import java.util.List;

public class ex10 {

	public static void main(String[] args) {
		List<String> nums=Arrays.asList("EE","SE");
		String ans=nums
				.parallelStream()//stream->java.util.stream-->Stream
				.reduce("Java ",(a,b)->a.concat(b));
		System.out.print(ans);

	}

}
/*

Given the code fragment:

List<String> nums=Arrays.asList("EE","SE");
String ans=nums
		.parallelStream()
		.reduce("Java ",(a,b)->a.concat(b));
System.out.print(ans);

What is the result?

A) Java EEJava SE

B) Java EESE

C) The program prints either:
   Java EEJava SE
   or
   Java SEJava EE
   
D) Java EEJava EESE


ans:A








*/
