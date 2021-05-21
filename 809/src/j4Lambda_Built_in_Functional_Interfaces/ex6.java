package j4Lambda_Built_in_Functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ex6 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(10,20,30);
		Function<Integer, Integer> fn=f1->f1+2;

		Consumer<Integer> conVal=s->System.out.print("Val:"+s+" ");
		li.stream().map(fn).forEach(conVal);
		
	}

}
/*
Given the code fragment:

List<Integer> li=Arrays.asList(10,20,30);
Function<Integer, Integer> fn=f1->f1*2;

Consume<Integer> conVal=s->System.out.print("Val:"+s+" ");
li.stream().map(fn).forEach(conVal);


What is the result?

A) Val:20 Val:40 Val:60

B) Val:10 Val:20 Val:30

C) Val: Val: Val:

D) A compilation error occurs.

ans:A






*/