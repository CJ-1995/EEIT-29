package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<List<String>> strs=Stream.of(
				Arrays.asList("text1","text2"),
				Arrays.asList("text2", "text3"));
				
		Stream<String> bs2=strs
				.filter(b->b.contains("text1"))
				.flatMap(rs->rs.stream());
				
		bs2.forEach(b->System.out.print(b));

	}

}
/*
Given the code fragment:

Stream<List<String>> strs=Stream.of(
		Arrays.asList("text1","text2"),
		Arrays.asList("text2", "text3"));
		
Stream<String> bs2=strs
		.filter(b->b.contains("text1"))
		.flatMap(rs->rs.stream());
		
bs2.forEach(b->System.out.print(b));

What is the result?

A) text1

B) text1text2

C) text1text2text2text3

D) [text1,text2]


ans:B




*/