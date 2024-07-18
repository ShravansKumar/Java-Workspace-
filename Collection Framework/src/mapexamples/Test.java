package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

class Test {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>();
		map.put(10, "Apple");
		map.put(20, "Samsung");
		map.put(30,"Oneplus");

		Set<Integer>key=map.keySet();
		for(int k:key) {
			System.out.println(k+ "  ->"+map.get(k));
		}




	}

}
