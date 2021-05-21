package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Personttt> sts=Arrays.asList(
				new Personttt("Jack",30),
				new Personttt("Mike Hill",21),
				new Personttt("Thomas Hill",24));
			Stream<Personttt> resList=sts.stream().filter(s->s.getAge()>=25);  // Line n1
			long count=resList.filter(s->s.getName().contains("Hill")).count();
			System.out.print(count);

	}

}
class Personttt {
	String name;
	int age;
	public Personttt(String name,int age){
		this.name=name;
		this.age=age;	
	}
	
	public String getName(){ return name;}
	public int getAge() { return age;}

}
/*
Given:

class Person {
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;	
	}
	
	public String getName(){ return name;}
	public int getAge() { return age;}

}

and the code fragment:

List<Person> sts=Arrays.asList(
	new Person("Jack",30),
	new Person("Mike Hill",21),
	new Person("Thomas Hill",24));
Stream<Person> resList=sts.stream().filter(s->s.getAge()>=25);  // Line n1
long count=resList.filter(s->s.getName().contains("Hill")).count();
System.out.print(count);

What is the result?

A) 0

B) An Exception is thrown at run time.

C) A compilation error occurs at line n1

D) 2

ans:A










*/