package j4Lambda_Built_in_Functional_Interfaces;

public class ex1 {
	public static void main(String args[])
	{
		Moveable<Integer> m=distance->System.out.println("diatance="+distance);
		
		m.run(100);
		Moveable.walk(200);
	}
	

}
interface Moveable<Integer> {
	 
    public static void walk(int distance) {
        System.out.println("Walking");
    }
 
    public void run(Integer distance);
}

/*
Given:
public interface Moveable<Integer> {
 
    public default void walk(Integer distance) {
        System.out.println("Walking");
    }
 
    public void run(Integer distance);
}
Which statement is true?

A. Moveable can be used as below:

Java

Moveable<Integer> animal = n -> System.out.println("Running" + n);
animal.run(100);
animal.walk(20);

B. Moveable can be used as below:

Java

Moveable<Integer> animal = n -> n + 10;
animal.run(100);
animal.walk(20);

C. Moveable can be used as below:

Java

Moveable animal = (Integer n) -> System.out.println(n);
animal.run(100);
Moveable.walk(20);

D. Movable cannot be used in a lambda expression.


*/