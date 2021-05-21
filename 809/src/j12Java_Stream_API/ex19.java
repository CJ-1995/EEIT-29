package j12Java_Stream_API;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntConsumer consumer=e->System.out.println(e);
		Integer value=90;
		//insert code fragment here
		ToIntFunction<Integer> funRef=e->e+10;
		  int result=funRef.applyAsInt(value);
		consumer.accept(result);

	}

}
/*
Given the code fragment:

5.IntConsumer consumer=e->System.out.println(e);
6.Integer value=90;
7.//insert code fragment here
8.consumer.accept(result);

Which code fragment,when insertd at line 7,enables printing 100?

A)IntFunction funRef=e->e+10;
  Integer result=funRef.apply(10);

B)ToIntFunction funRef=e->e+10;
  int result=funRef.apply(value);

C)Function<Integer> funRef=e->e+10;
  Integer result=funRef.apply(value);
  
D)ToIntFunction<Integer> funRef=e->e+10;
  int result=funRef.applyAsInt(value);


ans:D
*/