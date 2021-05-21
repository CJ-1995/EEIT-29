package j12Java_Stream_API;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream str=IntStream.of(1,2,3,4);
		Double d=str.average().getAsDouble();
		System.out.println("Average="+d);
		

	}

}
/*
Given the code fragment:

//line n1

Double d=str.average().getAsDouble();
System.out.println("Average="+d);

Which should be inserted into line n1 to print Average=2.5?

A) Stream str=Stream.of(1,2,3,4);

B) IntStream str=Stream.of(1,2,3,4);

C) DoubleStream str=Stream.of(1.0,2.0,3.0,4.0);

D) IntStream str=IntStream.of(1,2,3,4);


ans:D




*/