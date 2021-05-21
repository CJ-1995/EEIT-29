package j3Generics_and_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex20 {

	public static void main(String[] args) {
		Deque<String> queue=new ArrayDeque<>();
		queue.add("Susan");
		queue.add("Allen");
		queue.add("David");
		System.out.println(queue.pop());
		System.out.println(queue.remove());
		System.out.println(queue);
		
	}

}
/*
Given the code fragment:

Deque<String> queue=new ArrayDeque<>();
queue.add("Susan");
queue.add("Allen");
queue.add("David");
System.out.println(queue.pop());
System.out.println(queue.remove());
System.out.println(queue);

What is the result?

A) David
   David
   [Susan,Allen]
   
B) Susan
   Allen
   [David]
   
C) Susan
   Susan
   [Susan,Allen]
   
D) David
   Allen
   [Susan,Allen]
   
E) Susan
   Allen
   [Susan,David]
   
   
ans:B








*/