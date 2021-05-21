package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> prog=Arrays.asList(
				new Person("Smith",1500),
				new Person("John",2000),
				new Person("Joe",1000));
		double dVal=prog.stream()
					.filter(s->s.getFirstName().startsWith("J"))
					.mapToInt(Person::getSalary)
					.average()
					.getAsDouble();
		System.out.println(dVal);
		

	}

}

class Person{
	private String firstName;
	private int salary;
	public Person(String fN,int sal)
	{
		this.firstName=fN;
		this.salary=sal;
	
	}
	
	public int getSalary() {return salary;}
	public String getFirstName() { return firstName;}
	
}
/*
class Person{
	private String firstName;
	private int salary;
	public Person(String fN,int sal)
	{
		this.firstName=fN;
		this.salary=sal;
	
	}
	
	public int getSalary() {return salary;}
	public String getFirstName() { return firstName;}
	
}

and the code fragment:

List<Person> prog=Arrays.asList(
		new Person("Smith",1500),
		new Person("John",2000),
		new Person("Joe",1000));
double dVal=prog.stream()
			.filter(s->s.getFirstName().startsWith("J"))
			.mapToInt(Person::getSalary)
			.average()
			.getAsDouble();
System.out.println(dVal);


What is the result?

A) A compilation error occurs.

B) 2000.0

C) 1500.0

D) 0.0

ans:C


*/