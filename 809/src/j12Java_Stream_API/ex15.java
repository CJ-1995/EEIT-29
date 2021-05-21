package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;

public class ex15 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1, 2, 3);
		values.stream()
		        .map(n -> n * 2) //line n1
		        .forEach(System.out::print); //line n2
		        //.count();
		        

	}

}
/*
Given the code fragment:
List<Integer> values = Arrays.asList(1, 2, 3);
values.stream()
        .map(n -> n * 2) //line n1
        .peek(System.out::print) //line n2
        .count();
What is the result?

A.

246

B. The code produces no output.
C. A compilation error occurs at line n1.
D. A compilation error occurs at line n2.


*/