package j12Java_Stream_API;

import java.util.stream.Stream;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("Java","Unix","Linux")
		.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK:"+s))
		.findAny();

		

	}

}
/*
Given the code fragment:

public static void main(String[] args)
{
	Stream.of("Java","Unix","Linux")
	.filter(s->s.contains("n"))
	.peek(s->System.out.println("PEEK:"+s))
	//line n1

}

Which two code fragments, when inserted at line n1 independently, result in the output PEEK: Unix?

A) .anyMatch();
B) .noneMatch();
C) .allMatch();
D) .findFirst();
E) .findAny();



ans:DE


*/