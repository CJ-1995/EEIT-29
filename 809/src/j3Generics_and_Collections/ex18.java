package j3Generics_and_Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class ex18 {

	public static void main(String[] args) {
		List<Integer> codes=Arrays.asList(10,20);
		UnaryOperator<Integer> uo=s->s+10;
		codes.replaceAll(uo);
		codes.forEach(c->System.out.println(c));

	}

}
/*
Given the code fragment:

List<Integer> codes=Arrays.asList(10,20);
UnaryOperator<Double> uo=s->s+10.0;
codes.replaceAll(uo);
codes.forEach(c->System.out.println(c));

what is the result?

A) A compilation error occurs.

B) 20.0
   30.0
   
C) A NumberFormatException is thrown at run time.

D) 10
   20
   
ans:A

*/