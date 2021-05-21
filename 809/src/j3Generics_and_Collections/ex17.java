package j3Generics_and_Collections;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given the fragments:

class Person // line n1
{
	String name;
	Person(String name) {
		this.name=name;	
	}
	// line n2
}

and
 List<Person> emps=new ArrayList<>();
 // code that adds objects of the Person class to the emps list goes here
 Collections.sort(emps);
 
 
 Which two modifications enable to sort the elements of the emps list?
 
 A) Replace line n1 with
    class Person extends Comparator<Person>
 
 B) Replace line n1 with
    class Person implements Comparator<Perosn>
    
 C) At line n2 insert
    public int compareTo(Person p) {
    	return this.name.compareTo(p.name);    
    }
    
 D) At line n2 insert:
    public int compareTo(Person p,Person p2) {
    	return p1.name.compareTo(p2.name);    
    }
 
 E) At line n2 insert
    public int compare(Person p1,Person p2) {
    	return p1.name.compareTo(p2.name);    
    }
    
 F) Replace line n1 with
    class Person implements Comparable<Person>
    
    
 ans:C,F
*/