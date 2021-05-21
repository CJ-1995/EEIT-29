package j3Generics_and_Collections;

import java.util.Optional;

public class ex14 {

	public static void main(String[] args) {
		Optional<String> city1=getCountry("Paris");//France
		Optional<String> city2=getCountry("Las Vegas");//Optional.empty();
		System.out.println(city1.orElse("Not Found"));
		if (city2.isPresent())
			city2.ifPresent(x->System.out.println(x));
		else
			System.out.println(city2.orElse("Not Found"));

	}
	
	public static Optional<String> getCountry(String Ioc) {
		Optional<String> couName=Optional.empty();
		if("Paris".equals(Ioc))
			couName=Optional.of("France");
		else if("Mumbai".equals(Ioc))
			couName=Optional.of("India");
		return couName;

	}

}
/*
Given the code fragment:

public static Optional<String> getCountry(String Ioc) {
	Optional<String> couName=Optional.empty();
	if("Paris".equals(Ioc))
		couName=Optional.of("France");
	else if("Mumbai".equals(Ioc))
		couName=Optional.of("India");
	return couName;

}

and

Optional<String> city1=getCountry("Paris");
Optional<String> city2=getCountry("Las Vegas");
System.out.println(city1.orElse("Not Found"));
if (city2.isPresent())
	city2.ifPresent(x->System.out.println(x));
else
	System.out.println(city2.orElse("Not Found"));
	

What is the result?

A) Optional1[France]
   Optional[NotFound]
   
B) Optional[France]
   Not Found
   
C) France
   Optional[NotFound]
   
D) France
   Not Found
   
   
 ans:D


*/