package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cs=Arrays.asList("Java","Java EE","Java ME");
		boolean b=cs.stream().anyMatch(w->w.equals("Java"));
		System.out.print(b);
		

	}

}
/*
Given the code fragment:

List<String> cs=Arrays.asList("Java","Java EE","Java ME");
// line n1
System.out.print(b);

Which code fragment, when inserted at line n1, ensures false is printed?

A) boolean b=cs.stream().allMatch(w->w.equals("Java"));

B) boolean b=cs.stream().findAny().get().equals("Java");

C) boolean b=cs.stream().findFirst().get().equals("Java");

D) boolean b=cs.stream().anyMatch(w->w.equals("Java"));

ans:A





*/