package j3Generics_and_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex19 {

	public static void main(String[] args) {
		Deque<Integer> nums=new ArrayDeque<>();
		nums.add(1000);
		nums.push(2000);
		nums.add(3000);
		nums.push(4000);
		
		System.out.println(nums);
		Integer i1=nums.remove();
		Integer i2=nums.pop();
		System.out.println(nums);
		System.out.println(i1+" : "+i2);
		
	}

}
/*
Given the code fragment:

Deque<Integer> nums=new ArrayDeque<>();
nums.add(1000);
nums.push(2000);
nums.add(3000);
nums.push(4000);


Integer i1=nums.remove();
Integer i2=nums.pop();
System.out.println(i1+" : "+i2);

What is the result?

A) 1000:2000

B) 4000:2000

C) 4000:1000

D) 1000:4000

ans:B





*/