package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.reflect.generics.tree.ArrayTypeSignature;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> List2 = Arrays.asList("Hello","world");
		List<Integer> List3 = Arrays.asList(1,2,3);
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("word");
		//list.add(3.0);  // 1.5之後 Autoboxing
		
//		Double d = new Double(3.0); // boxing 把基本型別包裝成物件
//		double e = d.doubleValue(); //unboxing 把物件包裝成基本型別
//		list.add(d);
//		list.add(new Double(3.0));
//		Double f = Double.valueOf("3.0");
//		Double g = Double.valueOf("3.0");
//		System.out.println("3.0"+1);
//		System.out.println( f + 1);
		
		System.out.println("Size:"+list.size());
		//get(index)
		System.out.println("第一個:"+list.get(0));
		System.out.println("第二個:"+list.get(1));
		//System.out.println("第三個:"+list.get(2));
		
		
		for(int i = 0; i < list.size() ; i++) {
			System.out.printf("第%d個:%s%n",(i+1),list.get(i));
		}
		System.out.println("=========================");
		
		//list.iterator(); + alt shit L =下面
		Iterator<String> iterator = list.iterator(); 
		while (iterator.hasNext()) {  //hasNext()有沒有下一筆
			String item = iterator.next(); //iterator.next() 移到下一筆 把值取出來
			System.out.println(item);
		}
		
		System.out.println("=========================");
		
		for(String item : list) {
			System.out.println(item);
		}
		
	}

}













