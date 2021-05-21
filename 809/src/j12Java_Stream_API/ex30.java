package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;

public class ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> prices=Arrays.asList(3,4,5);
		prices.stream()
		      .filter(e->e>4)
		      .peek(e->System.out.print("Price "+e))//line 1
		      .map(n->n-1)//line 2
		      
		      .forEach(n->System.out.println(" New Price "+n));//line 3
		

	}

}
/* 
Given the code fragment:

List<Integer> prices=Arrays.asList(3,4,5);
prices.stream()
      .filter(e->e>4)
      .peek(e->System.out.print("Price "+e))//line 1
      .map(n->n-1)//line 2
      .peek(n->System.out.println(" New Price "+n));//line 3
      
Which modification enables the code to print Price 5 New Price 4?

A) Replace line n3 with.forEach(n->System.out.println(" New Price "+n));

B) Replace line n2 with.map(n->System.out.print(" New Price "+n-1)) and remove
   line n3
   
C) Replace line n1 with.forEach(e->System.out.print("Price "+e))

D) Replace line n2 with.mapToInt(n->n-1);


ans:A


*/