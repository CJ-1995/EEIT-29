package j3Generics_and_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex2 {
	public static void main(String args[])
	{
		List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
		Collections.sort(books, new Book());
		System.out.print(books);
	}
	

}
 class Book implements Comparator<Book> {
	 
    String name;
    double price;
 
    public Book() {
    }
 
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
 
    public int compare(Book b1, Book b2) {
        return b2.name.compareTo(b1.name);
    }
 
    public String toString() {
        return name + ":" + price;
    }
}
 
/*
Given the code fragments:
public class Book implements Comparator<Book> {
 
    String name;
    double price;
 
    public Book() {
    }
 
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
 
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }
 
    public String toString() {
        return name + ":" + price;
    }
}
and

Java

List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
Collections.sort(books, new Book());
System.out.print(books);

What is the result?

A.

[A Guide to Java Tour:3.0, Beginning with Java:2.0]

B.

[Beginning with Java:2.0, A Guide to Java Tour:3.0]

C. A compilation error occurs because the Book class does not override the abstract method compareTo().
D. An Exception is thrown at run time.

*/