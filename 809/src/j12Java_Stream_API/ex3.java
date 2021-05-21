package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex3 {

	public static void main(String[] args) {
		
		Stream<List<String>> iStr = Stream.of(
		        Arrays.asList("1", "John"),
		        Arrays.asList("2", null));
		IntStream nInSt = iStr.flatMapToInt((x) -> x.stream().mapToInt(Integer::valueOf));
		nInSt.forEach(System.out::print);
	}

}
/*
Given the code fragment:
Stream<List<String>> iStr = Stream.of(
        Arrays.asList("1", "John"),
        Arrays.asList("2", null));
IntStream nInSt = iStr.flatMapToInt((x) -> x.stream());
nInSt.forEach(System.out::print);
What is the result?

A.

1John2null

B.

12

C. A NullPointerException is thrown at run time.
D. A compilation error occurs.



*/