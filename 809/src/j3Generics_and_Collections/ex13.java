package j3Generics_and_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ex13 {

	public static void main(String[] args) {
		Map<Integer,Integer> mVal=new HashMap<>();
		mVal.put(1,10);
		mVal.put(2,20);
		BiConsumer<Integer,Integer> c=(i,j)->{System.out.print(i+","+j+"; ");};
		c.accept(1,2);
		mVal.forEach(c);

	}

}
/*
Given the code fragment:

Map<Integer,Integer> mVal=new HashMap<>();
mVal.put(1,10);
mVal.put(2,20);
//line n1
c.accept(1,2);
mval.forEach(c);


Which statement can be inserted into line n1 to print 1,2; 1,10; 2,20;?

A) BiFunction<Integer, Integer, String> c=(i,j)->{System.out.print(i+","+j+";")};

B) BiConsumer<Integer,Integer,String> c=(i,j)->{System.out.print(i+","+j+";")};

C) BiConsumer<Integer, Integer, Integer> c=(i,j)->{System.out.print(i+" , "+j+";");};

D) BiConsumer<Integer,Integer> c=(i,j)->{System.out.print(i+","+j+"; ");};

ans:D





*/