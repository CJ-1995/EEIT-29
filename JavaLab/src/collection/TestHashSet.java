package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();//LinkedHashSet:會記錄加入順序 但也是有成本的
		set.add("Hello");
		boolean add = set.add("Hello");
		System.out.println("加第二次Hello的結果:"+add);
		System.out.println("size:"+set.size());
		
		set.add("World");
//		set.add(3.0);
		System.out.println("size:"+set.size());

		boolean contains = set.contains("World");
		System.out.println("有沒有World:"+contains);
	
		for(String item : set) {
			System.out.println(item);
		}
	
		
	}
}
