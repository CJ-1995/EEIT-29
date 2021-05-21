package j3Generics_and_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class ex3 {
	 public static void main(String[] args) {
	        Map<Integer, String> unsortMap = new HashMap<>();
	        unsortMap.put(10, "z");
	        unsortMap.put(5, "b");
	        unsortMap.put(1, "d");
	        unsortMap.put(7, "e");
	        unsortMap.put(50, "j");
	        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2.compareTo(o1);
	            }
	        });
	        treeMap.putAll(unsortMap);
	        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
	            System.out.print(entry.getValue() + " ");
	        }
	    }
	 

}
/*
Given the code fragment:

public class Foo {
 
    public static void main(String[] args) {
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(50, "j");
        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.putAll(unsortMap);
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
}
What is the result?


A. A compilation error occurs.

B.

d b e z j

C.

j z e b d

D.

z b d e j

*/