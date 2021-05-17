package collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Hello");
		list.add("word");
		list.add(3.0);
		
		System.out.println("Size:"+list.size());
		//get(index)
		System.out.println("第一個:"+list.get(0));
		System.out.println("第二個:"+list.get(1));
		System.out.println("第三個:"+list.get(2));
		
		
		for(int i = 0; i < list.size() ; i++) {
			System.out.printf("第%d個:%s%n",(i+1),list.get(i));
		}
		
		
	}

}













