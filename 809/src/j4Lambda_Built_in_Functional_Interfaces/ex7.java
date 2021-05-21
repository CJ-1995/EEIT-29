package j4Lambda_Built_in_Functional_Interfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class ex7 {

	public static void main(String[] args) {
		BiPredicate<String,String> bp=(String s1,String s2)->s1.contains("s") && 
				   s2.contains("Java"); 
		BiFunction<String, String, Integer> bf=(String s1,String s2)->{
				      int fee=0;
				     if (bp.test(s1,s2)) {
				         fee=100;
				      }
				      return fee;
				 };
				 int feel=bf.apply("D101SG","Java Programming");
				 System.out.println(feel);

	}

}
/*
Given the code fragment:

7. BiPredicate<String,String> bp=(String s1,String s2)->s1.contains("SG") && 
   s2.contains("Java"); 
8. BiFunction<String, String, Integer> bf=(String s1,String s2)->{
9.      int fee=0;
10.     if (bp.test(s1,s2)) {
11.         fee=100;
12.      }
13.      return fee;
14. };
15. int fee1=bf.apply("D101SG","Java Programming");
16. System.out.println(feel);

What is the result?

A) A compilation error occurs at line 7.

B) 100

C) A compilation error occurs at line 15

D) A compilation error occurs at line 8


ans:B





*/