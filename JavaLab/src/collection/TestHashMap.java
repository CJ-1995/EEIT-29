package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {

		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2500);//上一行Tom:5000會被覆蓋
		
//		map.containsKey("Tom");
//		map.containsValue(2500);
		
		System.out.println("Tom's 薪水="+map.get("Tom"));

		Set<String> keySet = map.keySet(); 
		for(String key : keySet) {
			System.out.println(key+" = "+map.get(key));
			
			}
		//EntrySet
		int sum = 0;
		Set< Entry <String, Integer>> entrySet = map.entrySet();
		for(Entry <String, Integer> entry : entrySet) {
			sum = sum + entry.getValue();
			System.out.println(entry.getKey()+"="+entry.getValue());
			
//			Map.Entry entry = (Map.Entry)e;
//			Object value = entry.getValue();
//			System.out.println(e);
			
		}
		System.out.println("----------------forEach------------");
		
		BiConsumer<String, Integer> consumer = (key,valus)->{
			System.out.println("key"+key+",value"+valus);
		};
		map.forEach(consumer);
		//Method Reference
		map.forEach(TestHashMap::aaa);
		
		
		
		
	}
	public static void aaa(String key,Integer valus) {
		System.out.println("key"+key+",value"+valus);
	}
}
