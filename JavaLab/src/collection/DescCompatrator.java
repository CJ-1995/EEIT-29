package collection;

import java.util.Comparator;

public class DescCompatrator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 =(Integer) o1;
		Integer i2 =(Integer) o1;
		if(i1 > i2) { 
			return -1;
		}else if (i1 < i2) {
			return 1;
		}
		return 0;
	}

}
