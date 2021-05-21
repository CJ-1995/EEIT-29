package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> qwords=Arrays.asList("why", " what", " when ");
		BinaryOperator<String> operator=(s1,s2)->s1.concat(s2);// line n1
		String sen=qwords.stream()
			.reduce("Word: ",operator);
		System.out.println(sen);

	}

}
/*
Given the code fragment:

List<String> qwords=Arrays.asList("why", "what", "when ");
BinaryOperator<String> operator=(s1,s2)->s1.concat(s2);// line n1
String sen=qwords.stream()
	.reduce("Word: ",operator);
System.out.println(sen);

What is the result?

A) Word: why what when

B) Compilation fails at line n1.

C) Word: why Word: what Word: when

D) word: why word:why why what word: why what when

ans:A


*/