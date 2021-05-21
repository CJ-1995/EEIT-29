package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ex2 {
	public static void main(String args[])
	{
		
		List<String> nL = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s);
		nL.stream()
		        .map(funVal)
		        .forEach(System.out::print);
	}

}
/*
Given the code fragment:
List<String> nL = Arrays.asList("Jim", "John", "Jeff");
Function<String, String> funVal = s -> "Hello : ".concat(s);
nL.stream()
        .map(funVal)
        .peek(System.out::print);
What is the result?

A.

Hello : JimHello : JohnHello : Jeff

B.

JimJohnJeff

C. The program prints nothing.
D. A compilation error occurs.

*/