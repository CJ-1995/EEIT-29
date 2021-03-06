package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex4 {

	public static void main(String[] args) {
		
		List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
		Predicate<Emp> agVal = s -> s.getEAge() > 50; //line n1
		li = li.stream().filter(agVal).collect(Collectors.toList());
		Stream<String> names = li.stream().map(Emp::getEName); //line n2
		names.forEach(n -> System.out.print(n + " "));

	}

}

class Emp {
	 
    private String eName;
    private Integer eAge;
 
    Emp(String eN, Integer eA) {
        this.eName = eN;
        this.eAge = eA;
    }
 
    public Integer getEAge() {
        return eAge;
    }
 
    public String getEName() {
        return eName;
    }
}
/*
Given the definition of the Emp class:
public class Emp {
 
    private String eName;
    private Integer eAge;
 
    Emp(String eN, Integer eA) {
        this.eName = eN;
        this.eAge = eA;
    }
 
    public Integer getEAge() {
        return eAge;
    }
 
    public String getEName() {
        return eName;
    }
}
and code fragment:

Java

List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
Predicate<Emp> agVal = s -> s.getEAge() > 50; //line n1
li = li.stream().filter(agVal).collect(Collectors.toList());
Stream<String> names = li.stream().map(Emp::getEName); //line n2
names.forEach(n -> System.out.print(n + " "));

What is the result?

A.

Sam John Jim

B.

John Jim

C. A compilation error occurs at line n1.
D. A compilation error occurs at line n2.



*/