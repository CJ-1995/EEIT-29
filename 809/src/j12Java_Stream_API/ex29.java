package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=Arrays.asList("Java","J2EE","J2ME","JSTL","JSP","Oracle DB");
		Predicate<String> val=p->p.contains("J");
		List<String> neLi=li.stream().filter(x->x.length()>3)
			.filter(val).collect(Collectors.toList());
		System.out.println(neLi);
		

	}

}
/*

Given the code fragment:

List<String> li=Arrays.asList("Java","J2EE","J2ME","JSTL","JSP","Oracle DB");
Predicate<String> val=p->p.contains("J");
List<String> neLi=li.stream().filter(x->x.length()>3)
	.filter(val).collect(Collectors.toList());
System.out.println(neLi);


What is the result?

A) null

B) [Java,J2EE,J2ME,JSTL]

C) [Java, J2EE,J2ME,JSTL,JSP]

D) A compilation error occurs.


ans:B

*/