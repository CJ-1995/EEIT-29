package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;

public class ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vaList=Arrays.asList("","George","","John","Jim");
		Long newVal=vaList.stream()     // line n1
		         .filter(x->!x.isEmpty())
		         .count();                // line n2
		         
		System.out.print(newVal);

	}

}
/*
Given the code fragment:

List<String> vaList=Arrays.asList("","George","","John","Jim");
Long new Val=valList.stream()     // line n1
         .filter(x->!x.isEmpty())
         .count();                // line n2
         
System.out.print(newVal);

What is the result?

A) A compilation error occurs at line n1.

B) 3

C) 2

D) A compilation error occurs at line n2


ans:B






*/